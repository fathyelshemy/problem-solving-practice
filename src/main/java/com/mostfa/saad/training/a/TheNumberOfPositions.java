package com.mostfa.saad.training.a;

import java.util.Scanner;

/**
* @author fathyelshemy
* @category MostafaSaadSheet/a
* @see https://codeforces.com/contest/124/problem/A
*
*/
public class TheNumberOfPositions {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int res=n-(Math.max(a+1, n-b))+1;
		System.out.println(res);
	}

}
