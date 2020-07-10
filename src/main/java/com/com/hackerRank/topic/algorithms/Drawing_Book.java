package com.com.hackerRank.topic.algorithms;

import java.util.Scanner;

public class Drawing_Book {


    static int pageCount(int n, int p) {

        int frontDistance=((p)/2);
        int backDistance=((n/2-p/2));

        return Integer.min(frontDistance,backDistance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nSize = input.nextInt();
        int page=input.nextInt();

        System.out.println(pageCount(nSize,page));


    }
}
