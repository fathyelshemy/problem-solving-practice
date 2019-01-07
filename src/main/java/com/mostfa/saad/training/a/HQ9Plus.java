//package com.mostfa.saad.training.a;
//
//import java.util.Scanner;
//
///**
// * @author fathyelshemy
// * @category mostafaSaadSheet/a
// * @see https://codeforces.com/contest/133/problem/A
// *
// */
//public class HQ9Plus {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		String input=scan.nextLine();
//		if(input.contains("H")||input.contains("Q")
//				||input.contains("9")) {
//			System.out.println("YES");
//		}else if(input.contains("+")) {
//			String concat[]=input.split("[+=]");
//			if((concat.length==3)) {
//				if((concat[2].equals(concat[0].concat(concat[1])))) {
//					System.out.println("YES");
//
//				}else {
//					System.out.println("NO");
//				}
//			}else {
//				System.out.println("NO");
//			}
//		}else {
//			System.out.println("NO");
//		}
//	}
//
//}
