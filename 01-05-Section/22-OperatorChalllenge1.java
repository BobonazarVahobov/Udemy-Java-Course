package com.company;

public class Main {

    public static void main(String[] args) {

        double myDoubleValue1 = 20.00;
        double myDoubleValue2 = 80.00;
        double myLastDoubleValue = (myDoubleValue1 + myDoubleValue2) * 100.00;
        System.out.println("myLastDoubleValue = " + myLastDoubleValue);

        double myRemainderValue = myLastDoubleValue % 40.00;
        System.out.println("myRemainderValue = " + myRemainderValue);

        boolean myBoolValue = (myRemainderValue == 0) ? true : false;
        System.out.println("myBoolValue = " + myBoolValue);

        if (!myBoolValue) {
            System.out.println("Got some Remainder");
        }

    }
}
