package com.com.hackerRank.topic.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bon_Appétit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumTotal = (bill.stream().mapToInt(Integer::intValue).sum())/2;
        bill.remove(k);
        int sumDiscount = (bill.stream().mapToInt(Integer::intValue).sum())/2;
        int difference = b - sumDiscount;
        if (difference == 0){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(difference);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nSize = input.nextInt();
        int k = input.nextInt();
        List<Integer> inputs= new ArrayList<>();
        for(int i=0;i<nSize;i++){
            inputs.add(input.nextInt());
        }
        int paidAmount=input.nextInt();

        bonAppetit(inputs,k,paidAmount);


    }
}
