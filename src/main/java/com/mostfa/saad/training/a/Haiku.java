//package com.mostfa.saad.training.a;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Haiku {
//
//	private static char[] frequentArray= {'a','e','i','o','u'};
//
//	private static List<String>  takeInput() {
//		Scanner scan= new Scanner(System.in);
//		List<String> input= new ArrayList<>();
//		for(int i=0;i<3;i++) {
//			input.add(scan.nextLine());
//		}
//		return input;
//	}
//	
//	private static List<Integer>getNumberOfSaylable(List<String> input){
//		List<Integer>counter= new ArrayList<>(3);
//		
//		for(int i=0;i<3;i++) {
//			char[]x=input.get(i).toCharArray();
//			int countx=0;
//			for(int j=0;j<x.length;j++) {
//				for(int k=0;k<frequentArray.length;k++) {
//					if(x[j]==frequentArray[k]) {
//						countx++;
//					}
//				}
//			}
//			counter.add(countx);
//		}
//		return counter;
//	}
//	
//	private static void display(List<Integer> counter) {
//		if(counter.get(0)==5 && counter.get(1)==7 && counter.get(2)==5) {
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
//	}
//	public static void main(String[] args) {
//		List<String>input=takeInput();
//		List<Integer> operator=getNumberOfSaylable(input);
//		display(operator);
//	}
//
//}
