package net.alepuzio.provesintassi.lambda.method;

public class MainInstanceMethod {

	public static void main(String[] a){
		StringConverter stringConverter = new StringConverter();
		Deserializer des = stringConverter::convertToInt;
		System.out.println(des);
	}	
}

interface Deserializer {
    public int deserialize(String v1);
}

class StringConverter {
    public int convertToInt(String v1){
        return Integer.valueOf(v1);
    }
    
    @Override 
    public String toString(){
    	return "StringConverter";
    }
}
