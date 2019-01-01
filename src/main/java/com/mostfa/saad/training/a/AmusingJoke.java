//package com.mostfa.saad.training.a;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AmusingJoke {
//
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//		String host=scan.nextLine();
//		String guest=scan.nextLine();
//		String shuffledMax=scan.nextLine();
//		
//		String maxed=host.concat(guest);
//		char[] maxedChared=maxed.toCharArray();
//		char[] shuffledMaxChar=shuffledMax.toCharArray();
//		List<String>max=new LinkedList<>();
//		List<String>shuffled=new LinkedList<>();
//
//		for(int i=0;i<maxedChared.length;i++) {
//			max.add(String.valueOf(maxedChared[i]));
//		}
//		for(int i=0;i<shuffledMaxChar.length;i++) {
//			shuffled.add(String.valueOf(shuffledMaxChar[i]));
//		}
//		if(maxedChared.length==shuffledMax.length()) {
//			
//			for(int i=0;i<max.size();i++) {
//				for(int j=0;j<shuffled.size();j++) {
//					if(max.get(i).equals(shuffled.get(j))) {
//						shuffled.remove(j);
//						break;
//					}
//				}
//			}
//
//			if(shuffled.size()==0) {
//				System.out.println("YES");
//			}else {
//				System.out.println("NO");
//			}
//		}else {
//			System.out.println("NO");
//		}
//	}
//
//}
