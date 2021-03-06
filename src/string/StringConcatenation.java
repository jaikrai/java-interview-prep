package string;

public class StringConcatenation {
    public static void main(String[] args) {

        //concat() is an instance method of the String class that allows you to
        // concatenate strings, but it isn't the only way we can do this.
        // We can concatenate String
        // Using .concat(), the concatenation operator, StringBuilder class, or
        // StringBuffer class are all different ways we can concatenate strings.

        String firstName = "Shelly";
        String lastName = "Parker";

        String name = firstName + " " + lastName;
        System.out.println("first concat: "+name);
        String concatName = (firstName.concat(" ").concat(lastName));
        System.out.println(concatName);

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");//abcdef
        stringBuilder.append("lmno"); //abcdeflmno
        stringBuilder.insert(0,"zxr"); // zxrabcdeflmno
        stringBuilder.delete(2,5); // zxcdeflmno
        String alpha = stringBuilder.toString();
        System.out.println(alpha);

        // difference between buffer and builder is  buffer is threat safe coz it's methods are synchronized
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("def");//abcdef
        stringBuffer.append("lmno"); //abcdeflmno
        stringBuffer.insert(0,"zxr"); // zxrabcdeflmno
        stringBuffer.delete(2,5); // zxcdeflmno
        String alpha1 = stringBuffer.toString();
        System.out.println(alpha1);


    }
}
