package com.company;

public class Main {

    private static final String INVALID_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 9));
        System.out.println(getDurationString(-75, 3));
        System.out.println(getDurationString(45, 33));
        System.out.println(getDurationString(42345, 33));
        System.out.println(getDurationString(-33));
        System.out.println(getDurationString(236533));
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(581760);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer) {
            return (temperature >= 25 && temperature <= 45);
        } else {
            return (temperature >= 25 && temperature <= 35);
        }
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
            return;
        }
        if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (minutes == 0) {
            System.out.println("0 min = 0 y and 0 d");
            return;
        }
        long years = minutes / 525_600L;
        long days;
        long min;
        if (minutes % 525_600L == 0) {
            days = 0;
        } else {
            min = minutes % 525_600L;
            days = min / (60*24);
        }
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >59) {
            return INVALID_MESSAGE;
        }
        int hours = minutes / 60;
        String hourString;
        if (hours < 10) {
            hourString = "0" + hours + "h ";
        } else {
            hourString = String.valueOf(hours) + "h ";
        }
        minutes = minutes % 60;
        String minuteString;
        if (minutes < 10) {
            minuteString = "0" + minutes + "m ";
        } else {
            minuteString = String.valueOf(minutes) + "m ";
        }
        String secondsString;
        if (seconds < 10) {
            secondsString = "0" + seconds + "s";
        } else {
            secondsString = String.valueOf(seconds) + "s";
        }

        return hourString + minuteString + secondsString;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1d;
        }
        return Math.PI * (radius * radius);
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1d;
        }
        return x * y;

    }


}
