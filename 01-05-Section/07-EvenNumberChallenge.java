package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(45));
        int number = 4;
    int finishNumber = 20;
    int count = 0;
    while(number <= finishNumber){
        number++;
        if(!isEvenNumber(number)){
            continue;
        }

            count ++;
        System.out.println(count + ". Even number " + number);

        if(count == 5){
            break;
        }

    }
    }

    public static boolean isEvenNumber(int number){
        return (number % 2) == 0;
    }
}
