package com.com.hackerRank.topic.algorithms;

import java.util.Scanner;

/**
 * @Link: https://www.hackerrank.com/challenges/electronics-shop/problem
 * @Auther: fathy elshemy
 */
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int optimalMax=-1;

        for (int k :keyboards) {
            for (int d : drives) {
                int sum=k+d;
                if(sum>optimalMax && sum<=b)
                    optimalMax=sum;
            }
        }

        return optimalMax;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int budget = input.nextInt();
        int keyboardSize=input.nextInt();
        int driveSize= input.nextInt();
        int [] keyboards = new int [keyboardSize];
        int [] drives = new int [driveSize];

        for(int i=0;i<keyboardSize;i++){
            keyboards[i]=input.nextInt();
        }
        for(int i=0;i<driveSize;i++){
            drives[i]=input.nextInt();
        }

        System.out.println(getMoneySpent(keyboards,drives,budget));
    }
}
