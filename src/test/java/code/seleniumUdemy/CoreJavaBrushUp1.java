package code.seleniumUdemy;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {

        int myNum =5;
        String website = "Chad Andrew Academy";
        char letter = 'r';
        double dev = 5.99;
        boolean myCard = true;

        System.out.println(myNum); //5 output
        System.out.println(website); //"Chad Andrew Academy"

        //Array -
        int [] arr = new int [5]; //5,10 is how many you want to assign simple java array

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int [] arr2 = {1,2,4,5,6}; //initially assigned

        System.out.println(arr2[0]);

        // for loop arr.length -5

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }

        String [] name = {"omer","baris","selenium"};

        for (int i = 0; i <name.length ; i++) {
            System.out.println(name[i]);
        }

        //let's do with for each

        for (String s: name) {
            System.out.println(s);
        }













    }
}
