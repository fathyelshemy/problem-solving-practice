//package com.mostfa.saad.training.a;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * @author fathyelshemy
// * @category mostafaSaad sheet a 
// * @see https://codeforces.com/contest/567/problem/A
// *
// */
//public class LinelandMail {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		int size = Integer.valueOf(scan.nextLine());
//		List<Integer> input= new ArrayList<>();
//		
//		for(int i=0;i<size;i++) {
//			input.add(scan.nextInt());
//		}
//		
//		for(int i=0;i<size;i++) {
//			int min=0,
//				max=0;
//				if(i==0) {
//					max=Math.abs(input.get(0)-input.get(size-1));
//					min=Math.abs(input.get(0)-input.get(1));
//				}else if(i==size-1) {
//					max=Math.abs(input.get(0)-input.get(size-1));
//					min=Math.abs(input.get(size-1)-input.get(size-2));
//				}else {
//					max=Math.max(Math.abs(input.get(i)-input.get(size-1)), Math.abs(input.get(i)-input.get(0)));
//					min=Math.min(Math.abs(input.get(i)-input.get(i+1)), Math.abs(input.get(i)-input.get(i-1)));
//				}
//				System.out.println(min+" "+max);
//		}
//		
//
//	}
//
//}
