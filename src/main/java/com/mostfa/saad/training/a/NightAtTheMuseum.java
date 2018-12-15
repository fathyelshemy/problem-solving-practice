package com.mostfa.saad.training.a;

//import java.util.Scanner;
//
//public class NightAtTheMuseum {
//
//	private static char[] frequentArray= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		String input= scan.nextLine();
//		char [] inputArray=input.toLowerCase().toCharArray();
//		int size=inputArray.length;
//		int sum=0;
//		int temp=0;
//		for(int i=0;i<size;i++) {
//			int counterClockWise=0,clockWise=0;
//			
//			for(int j=0;j<frequentArray.length;j++) {
//				if(inputArray[i]==frequentArray[j]) {
//					clockWise=Math.abs(temp- j);
//					counterClockWise=Math.abs(26-clockWise);
//					if(clockWise>counterClockWise) {
//						sum+=counterClockWise;
//					}else {
//						sum+=clockWise;
//					}
//					temp=j;
//				}
//			}
//		}
//		System.out.println(sum);
//	}
//
//}
