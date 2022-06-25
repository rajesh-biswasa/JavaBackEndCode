package com.day3;

public class ExplainStatic {
    /*
    Static variable - Static variables can be accessed by both static and non-static methods.
                      Static variables are shared among all instances of a class.
    Non static varible - Non static variables cannot be accessed inside a static method.
                        Non static variables are specific to that instance of a class.
     */
    //static variable
    static int a = 5;
    static int b = 9;
    // non static variable
    int i = 8;
    int j = 34;

    void sum(){
        int ans = i + j;
        System.out.println(ans);
    }

    public static void main(String[] args) {

        //int result = sum(i,j); //error - non static method can't be accessed inside static method.

        int result = a+b; //static variable can be directly accessed in static method.
        System.out.println(result);


        ExplainStatic obj = new ExplainStatic();
        obj.i = 10;  //reassinge i value using instance of class;
        obj.sum(); // non static method or varible can be accessed using instance of that class.

    }


}
