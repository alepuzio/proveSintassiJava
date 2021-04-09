package net.alepuzio.provesintassi.lambda.diamond;

/*
 * from http://tutorials.jenkov.com/java/lambda-expressions.html 
 * */
public interface InterfaceStaticDefault {

    void printIt(String text);
/*
If you decomment this block, you receive compile-error 
in net.alepuzio.provesintassi.lambda.diamond.ImplementingClass

Duplicate default methods named printUtf8To with the parameters (String, OutputStream) 
and (String, OutputStream) are inherited from the types InterfaceStaticDefault 
and InterfaceDefault

    default public void printUtf8To(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }
*/
    static void printItToSystemOut(String text){
        System.out.println(text);
    }
}