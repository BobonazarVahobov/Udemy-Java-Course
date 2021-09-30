package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDuration(234, 56));

        System.out.println(getDuration(3800));
    }
    public static String getDuration(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value" ;
        }

        int hours = minutes /  60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s ";

    }

    public static String getDuration(int seconds){
        if(seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remSeconds = seconds % 60;

        return getDuration(minutes, remSeconds);
    }
}
