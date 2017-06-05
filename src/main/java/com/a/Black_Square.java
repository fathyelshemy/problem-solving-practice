//package com.a;
//
//import java.util.Scanner;
//
//public class Black_Square {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan= new Scanner(System.in);
//		int [] values= new int[4];
//		for(int i=0;i<4;i++){
//			values[i]=scan.nextInt();
//		}
//		String places= scan.next();
//		char [] placesChar=places.toCharArray();
//		int sum=0;
//		for(int i=0;i<places.length();i++){
//			if(placesChar[i]=='1')
//				sum+=values[0];
//			else if(placesChar[i]=='2')
//				sum+=values[1];
//			else if(placesChar[i]=='3')
//				sum+=values[2];
//			else if(placesChar[i]=='4')
//				sum+=values[3];
//		}
//		System.out.println(sum);
//	}
//
//}
