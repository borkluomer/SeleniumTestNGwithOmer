package code.seleniumUdemy;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {

        //string is an object

        String s1 = "Chad Andrew";
        String s5 = "hello";
        // String is an object represents secants of

        //String with literal
        String s2 = new String();
        String s3 = new String();

        String s = "Chad Andrew Redstone";

        String [] splittedString = s.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);
        System.out.println(splittedString[1].trim());

        //reverse order
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.println(s.charAt(i));
        }


    }
}
