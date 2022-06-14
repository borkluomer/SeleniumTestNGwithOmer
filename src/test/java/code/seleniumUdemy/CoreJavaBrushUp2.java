package code.seleniumUdemy;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};

        //2,4,6,8,10,122

        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] % 2 == 0){
                System.out.println(arr2[i] +" number is divisible by 2 evenly ");

           }
            else{//optional
                System.out.println(arr2[i] + " not divisible by 2 evenly ");
            }
        }

        ArrayList<String> a = new ArrayList<String >();
        a.add("Omer");
        a.add("Baris");
        a.add("academy");
        a.add("Selenium");
        a.remove(2);
        System.out.println(a);
        System.out.println(a.get(2));


        //create an object of that class - object.method this is how you call it



    }
}
