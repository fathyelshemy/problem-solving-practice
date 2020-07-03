package com.mostfa.saad.training.a;

import java.util.Scanner;

/**
 * @author fathyelshemy
 * @category mostafaSaadSheet/a
 * @see https://codeforces.com/contest/451/problem/A
 */
public class GameWithSticks {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);

		int n= scan.nextInt();
		int m= scan.nextInt();
		int sum=Math.min(n, m);
		if(sum%2==0) {
			System.out.println("Malvika");
		}else {
			System.out.println("Akshat");
		}
	}

}
