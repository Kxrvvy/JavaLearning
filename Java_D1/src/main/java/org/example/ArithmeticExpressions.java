package org.example;

public class ArithmeticExpressions {
    public void arithmeticDemo(){
        // use 'final' keyword when you want it fixed and unchangeable
        //final float PI = 3.14f;

        // [+,-,*,/] = operators
        // numbers = operands
        System.out.println("--Arithmetic Expressions Demo--");
        //Addition
        int Addition = 10 + 3;
        System.out.println("Add: " + Addition);
        //Subtraction
        int Subtraction = 10 - 3;
        System.out.println("Subtraction: " + Subtraction);
        //Multiplication
        int Multiplication = 10 * 3;
        System.out.println("Multiplication: " + Multiplication);
        //Division
        /* make the values float/double  */
        double Division = (double)10 / (double)3; // called expression because it produces value
        System.out.println("Division: " + Division);

        /* Increment & Decrement */

        //Increment
        System.out.println("\n--Increment&Decrement--");
        // give first the value to y before increment x
        int x = 1;
        int y = x++; // post fix
        System.out.println("postfix");
        System.out.println("value x: " + x);
        System.out.println("value y: " + y);

        // increment z first before giving value to t
        int z = 1;
        int t = ++z; // prefix fix
        System.out.println("prefix");
        System.out.println("value z: " + z);
        System.out.println("value t: " + t);

        //incrementing a value to more than one
        int a = 1;
        a += 2; // a = a+2 (Augmented assignment operators)
        System.out.println("\nAugmented Ass. value: " + a);

        // Order Operators
        // follow PEMDAS rule
        int b = 10 + 3 * 2;
        System.out.println("\nOrder Operators value: " + b);

        //Casting
            //Implicit Casting or Automatic Conversion
            // byte > short > int > long > float > double
        short c = 1;
        int d = c + 2;
        System.out.println("\nCasting value: " + d);

        // having double c int d
        /* double c = 1.1;
           int d = (int)c + 2; // need to make c and int
           System.out.println("\nCasting value: " + d);
        */

        /* If c is a String and needs to convert into int, use 'parse'.
           Integer.parseInt, Float.parseFloat, ...

           String x = "2";
           int y = Integer.parseInt(x) + 2
           System.out.println(" value: " + y);
         */
    }
}
