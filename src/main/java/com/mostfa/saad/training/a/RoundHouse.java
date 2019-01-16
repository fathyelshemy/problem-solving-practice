//package com.mostfa.saad.training.a;
//
//import java.util.Scanner;
///**
//* @author fathyelshemy
//* @category MostafaSaadSheet/a
//* @see https://codeforces.com/contest/659/problem/A
//*
//*/
//public class RoundHouse {
//
//	public static void main(String[] args) {
//
//		Scanner scan= new Scanner(System.in);
//		int n=scan.nextInt();
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		
//		int mod=b%n;
//		int res=a+mod;
//		while(res>n) {
//			res=res-n;
//		}
//		int out=(res>0) ? (res) : (n+res);
//		System.out.println(out);
//		
//	}
//
//}
