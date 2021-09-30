package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(12555));
    }
    public static int sumDigits(int number){
        int count = 0;


        if(number >= 10) {
            while (number > 0) {
                count += number % 10;
                number = number / 10;

            }
            return count;
        }
        return -1;

//        if(number >= 10){
//            for(int i = 0; i < 4; i ++){
//                count += number % 10;
//                number = number / 10;
//
//            }
//            return count;
//        }
//        return -1;
    }
}
