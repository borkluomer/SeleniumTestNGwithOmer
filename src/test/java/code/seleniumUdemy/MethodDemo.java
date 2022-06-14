package code.seleniumUdemy;

import java.lang.reflect.Method;

public class MethodDemo {
    public static void main(String[] args) {

        MethodDemo d = new MethodDemo();
        String name = d.getData();
        System.out.println(name);

        MethodDemo2 d1 = new MethodDemo2();
        d1.getUserData();
        getData2();


    }

    public String getData() {
        System.out.println("Hello World");
        return "Chad Andrew";
    }

    public static String getData2() {
        return "Chad Andrew";


    }
}
