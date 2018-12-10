//package com.vJudge.contest1;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class C_A_frequencyArray {
//
//	private static String takeInputString() {
//		
//		Scanner scan = new Scanner(System.in);
//		int n= Integer.valueOf(scan.nextLine());
//		String input=scan.nextLine();
//		return input;
//	}
//	private static int getNumOfFrequence(String input) {
//		char []inputChar=input.toLowerCase().toCharArray();
//		Set<String> hashSet= new HashSet();
//		for(char c:inputChar) {
//			hashSet.add(String.valueOf(c));
//		}
//		int frequentSize=hashSet.size();
//		return frequentSize;
//	}
//	private static void print(int num) {
//		if(num>=26) {
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
//	}
//	public static void main(String[] args) {
//		String input=takeInputString();
//		int numOfDistinct=getNumOfFrequence(input);
//		print(numOfDistinct);
//
//	}
//
//}
