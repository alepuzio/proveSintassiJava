package net.alepuzio.provesintassi.lambda.harvard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**from https://www.softwaretestinghelp.com/java-8-interview-questions**/
public class Print5RandomNumberSorted {
	
	public static void main(String[] a){
		Random random = new Random();
		random.setSeed(2L);
		random.ints().limit(5).sorted().forEach(i -> System.out.println(i));
		 System.out.println("Intermediate Operation won't execute");
	        Arrays.stream(new int[] { 0, 1 }).map(i -> { 
	        	System.out.println(i);
	            return i;//No terminal operation so it won't execute
	        });
	        System.out.println("Terminal operation starts here");
	        Arrays.stream(new int[] { 0, 1 }).map(i -> {
	            System.out.println(i);
	            return i;// This is followed by terminal operation sum()
	        }).sum();
	        
	        System.out.println(sumNumberList());
	        filterBigger100Mean(numberList());	
	        System.out.println(lowestHighestNumbers(numberList()));
	        System.out.println(sumNumberList());
	        flatMap();
	        map();
	        streamIterate();
	}
	 private static String sumNumberList() {
		   System.out.println("Sum all the numbers in a list");
	       return String.format("sum: %d", numberList().stream().mapToInt(i -> i).sum());
	 }	
	 
	 private static void flatMap() {
		   System.out.println("flatMap");
		   List<List<String>> names = Arrays.asList(
	        		Arrays.asList("Saket", "Trevor"), 
	        		Arrays.asList("John", "Michael"),
	                Arrays.asList("Shawn", "Franklin"), 
	                Arrays.asList("Johnty", "Sean")
	                );
	        List<String> start = names.stream()
	        		.flatMap(firstName -> firstName.stream())/*create another stream*/
	        		.filter(s -> s.startsWith("S"))/*verify in dependent stream*/
	                .collect(Collectors.toList());
	        start.forEach(System.out::println);
	    }

	 private static void map(){
		 List<String> names = Arrays.asList("Saket", "Trevor", "Franklin", "Michael");
	     List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
	     upperCase.forEach(System.out::println);
	 }
	private static List<Integer> numberList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		return list;
	}
	
	private static String lowestHighestNumbers(List<Integer> list) {
        System.out.println("to find the lowest and highest number of a Stream");
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        return String.format("min: %d, max: %d", min, max);
	}

	private static void filterBigger100Mean(List<Integer> list) {
		System.out.println("to square the list of numbers and then filter out the numbers greater than 100 and then find the average of the remaining numbers");
		/*Predicate<Integer> biggerThan100 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return 100 < t.intValue();
			}
		};*/
		//Function<Integer, Integer> squareNumber = i -> i*i;
		ToIntFunction<Integer> squareNumber = i -> i*i;
		IntPredicate biggerThan100 = i -> (100 < i);
		System.out.println(list.stream().mapToInt(squareNumber).filter(biggerThan100).average());
	}
	
	private static void streamIterate() {
		System.out.println("Create List and print every odd number smaller than 5");
        Stream.iterate(2, count->count+1)/*Counter Started from 2, incremented by 1*/ 
        .filter(number->number%2==0)/*Filtered out the numbers whose remainder is zero when divided by 2*/  
        .limit(5)/*Limit is set to 5, so only 5 numbers will be printed*/  
        .forEach(System.out::println);
	}		
}
