package net.alepuzio.provesintassi.generics.method;

//TODO creare test di unita'
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
    
    
    public static void main(String [] a){
    	Pair<Integer, String> p1 = new Pair<>(1, "apple");
    	Pair<Integer, String> p2 = new Pair<>(2, "pear");
    	boolean same = Util.<Integer, String>compare(p1, p2);//declared type
    	System.out.println("same:"+same);
    	Pair<Integer, String> p3 = new Pair<>(1, "apple");
    	Pair<Integer, String> p4 = new Pair<>(2, "pear");
    	boolean same2 = Util.compare(p3, p4);//implicit type
    	System.out.println("same2:"+same2);
    }
}