//package com.mostfa.saad.training.a;
//
//import java.util.Arrays;
//import java.util.Scanner;
///**
//* @author fathyelshemy
//* @category MostafaSaadSheet/a
//* @see https://codeforces.com/contest/496/problem/A
//*
//*/
//public class MinimumDifficulty
//{
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
//        int a[]=new int [105];
//        int max=0,min=1000;
//        for(int i=0;i<n;i++)
//        {
//            a[i]=scanner.nextInt();
//        }
//        for(int i=1;i<n-1;i++)
//        {
//            max=0;
//            for(int j=1;j<n;j++)
//            {
//                int k;
//                if(j!=i)
//                    k=a[j]-a[j-1];
//                else
//                    k=a[j+1]-a[j-1];
//                if(k>max)
//                    max=k;
//            }
//            if(max<min)
//                min=max;
//        }
//        System.out.println(min);
//    }
//}