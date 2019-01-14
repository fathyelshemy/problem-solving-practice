//package com.mostfa.saad.training.a;
//
//import java.util.Scanner;
//
///**
// * @author fathyelshemy
// * @category MostafaSaadSheet/a
// * @see https://codeforces.com/contest/577/problem/A
// *
// */
//public class MultiplicationTable {
//	
//	private static long [][] createMatrix(int n){
//		long a[][]=new long [n][n];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=(i+1)*(j+1);
//			}
//		}
//		return a;
//	}
//	
//	private static int countNumber(long a[][],int number) {
//		int counter=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i][j]==number) {
//					counter++;
//				}
//			}
//		}
//		return counter;
//	}
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		int n=scan.nextInt();
//		int number=scan.nextInt();
//		int result=0;
//		for(int i=1;i<=n;i++) {
//			if(number%i==0&& number/i<=n) {
//				result++;
//			}
//		}
//		System.out.println(result);
//		
//	}
//
//}
