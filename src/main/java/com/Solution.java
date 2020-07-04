package com;
// this is default class for solve any new problem
// this is default class for solve any new problem

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer>numbers= Arrays.stream(ar).boxed().collect(Collectors.toList());
        numbers.sort(Integer::compareTo);
        int counter=0;
        for(int i=0;i<n-1;i++){
            if(numbers.get(i)==numbers.get(i+1)){
                counter++;
                numbers.remove(i+1);
                n--;

            }
        }
//        for(int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                if(numbers.get(i)==numbers.get(j)){
//                    counter++;
//                    numbers.remove(j);
//                    n--;
//                    break;
//                }
//
//            }
//        }
    return counter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nSize = input.nextInt();
        int [] inputs= new int [nSize];
        for(int i=0;i<nSize;i++){
            inputs[i]=input.nextInt();
        }

        System.out.println(sockMerchant(nSize,inputs));


    }
}
