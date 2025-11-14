package org.example;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Learning Static
            /* para syang dorm na nag ccontain ng tenants. lahat ng tenants na nandun sa dorm ay
                mabibiang ni static. Pero kapag tinanggal mo ung static; parang ginawa mo ay binigyan
                mo ng tig iisang kwarto/container ung mga tenant. so need mo isa-isahin ang 'numberOfFriends'.*/

        // This is called Instances
        Friends friend1 = new Friends("Spongebob");
        Friends friend2 = new Friends("patrick");
        Friends friend3 = new Friends("Squidward");
        Friends friend4 = new Friends("Sandy");

        System.out.println(Friends.numberOfFriends);

        // Using methods

        Friends.displayFriends();

        // -----------------------------------------------------------------------------------------------------------
        System.out.println("-------------------");
        // Example of primitive type
            // Primitive stores value
        int a = 32;
        System.out.println("this is primitive type: ");

        // Example of a reference type
            // Reference Stores address
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 5;
        System.out.println("this is reference type: " + point2);

        // Learning String, Escape Sequences
        System.out.println("-------------------");
        System.out.println("--String Demo--");
        StringDemo stringDemo = new StringDemo();
        stringDemo.runStringDemo();


        //Learning Arrays
        System.out.println("-------------------");
        System.out.println("--Arrays Demo--");
        ArraysDemo arraysDemo = new ArraysDemo();
        arraysDemo.arraysDemo();

        // Learning Arithmetics
        System.out.println("-------------------");
        ArithmeticExpressions arithmeticExpressions = new ArithmeticExpressions();
        arithmeticExpressions.arithmeticDemo();

    }
}