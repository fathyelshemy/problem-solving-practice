package com.com.hackerRank.topic.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Result {


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int max= Integer.max(a.stream().mapToInt(x-> x).max().getAsInt(), b.stream().mapToInt(x->x).max().getAsInt());
        int min=Integer.min(a.stream().mapToInt(x-> x).min().getAsInt(), b.stream().mapToInt(x->x).min().getAsInt());

        IntStream maxStream=IntStream.rangeClosed(min,max);

        long result =maxStream
                .filter(x->  {
                    long counter=a.stream().filter(number_a -> x%number_a==0).count()+
                                b.stream().filter(number_b-> number_b%x==0).count();
                    return counter==(a.size()+b.size());
                }).count();
        return (int)result;
    }

}

public class Between_two_sets {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int m = input.nextInt();

        List<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(input.nextInt());

        List<Integer> brr = new ArrayList<>();
        for(int i=0;i<m;i++)
            brr.add(input.nextInt());
        int total = Result.getTotalX(arr, brr);
        System.out.println(total);
    }
}
