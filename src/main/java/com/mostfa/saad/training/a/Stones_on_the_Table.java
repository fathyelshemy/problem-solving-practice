package com.mostfa.saad.training.a;

import java.util.Scanner;

public class Stones_on_the_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		String colorstr=scan.next();
		char[] colors=colorstr.toCharArray();
		int counter=0;
		for(int i=0;i<n-1;i++){
			if(colors[i]==colors[i+1])
				counter++;
		}
		System.out.println(counter);
	}

}
