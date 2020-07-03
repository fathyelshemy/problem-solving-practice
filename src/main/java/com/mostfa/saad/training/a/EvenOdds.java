package com.mostfa.saad.training.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author fathyelshemy
 * @category mostafaSaadSheet/a
 * @see https://codeforces.com/contest/318/problem/A
*/
public class EvenOdds {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		long size=scan.nextLong();
		long index=scan.nextLong();
		long result=0;
		if(index>size/2) {
			if(size%2==0) {
				result=2*(index-(size/2));
			}else {
				result=2*(index-((size+1)/2));
			}
		}else {
			result=index*2-1;
		}
		System.out.println(result);
	}

}
