package com.company;

public class Main {

    public static void main(String[] args) {

       // System.out.println("Number Odd: " + isOdd(23));
        System.out.println("Sum: " + sumOdd(1, 100));
        System.out.println("Sum: " + sumOdd(-1, 100));
        System.out.println("Sum: " + sumOdd(100, 100));
        System.out.println("Sum: " + sumOdd(13, 13));
        System.out.println("Sum: " + sumOdd(100, -100));
        System.out.println("Sum: " + sumOdd(100, 1000));
    }
    public static boolean isOdd(int number){
        return number % 2 == 1;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start < 0 || end < 0 || end < start)
            return -1;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                 sum += i;
            }

        }
        return sum;
    }
}
