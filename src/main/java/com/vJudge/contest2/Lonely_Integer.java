//package com.vJudge.contest2;
//
//import java.util.Scanner;
//
//public class Lonely_Integer {
//
//	public static void main(String[] args) {
//
//		Scanner scan= new Scanner(System.in);
//		int n=Integer.parseInt(scan.nextLine());
//		int a[]= new int[n];
//		
//		for(int i=0;i<n;i++) {
//			a[i]=scan.nextInt();
//		}
//		scan.close();
//		int unique=0;
//		
//		for(int i=0;i<n;i++) {
//			int temp=a[i];
//			int counter=0;
//			for(int j=0;j<n;j++) {
//				if(a[j]==temp) {
//					counter++;
//				}
//			}
//			if(counter==1) {
//				unique=temp;
//			}
//		}
//		System.out.println(unique);
//	}
//
//}
