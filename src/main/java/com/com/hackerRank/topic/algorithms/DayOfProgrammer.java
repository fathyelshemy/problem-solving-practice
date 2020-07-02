package com.com.hackerRank.topic.algorithms;

import java.io.IOException;
import java.util.Scanner;

public class DayOfProgrammer {

    static String dayOfProgrammer(int year) {
        if(year==1918)
            return "26.09.1918";
        else if(isLeap(year))
            return "12.09."+year;
        else
            return "13.09."+year;

    }
    static boolean isLeap(int year){
        if(year>1918) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year%400==0))
                return true;
        }else{
            if(year%4==0)
                return true;
        }

        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(dayOfProgrammer(year));

    }
}
