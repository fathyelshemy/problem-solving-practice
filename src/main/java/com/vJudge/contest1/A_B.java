package com.vJudge;

import java.util.Scanner;

public class A_B {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String input=scan.nextLine();
		char[] charInput=input.toCharArray();
		StringBuilder output= new StringBuilder();
		int size= charInput.length-1;
		int counter=1;
		for(int i=0;i<=size;i++) {
			if(i!=size) {
				if(charInput[i]==charInput[i+1])
					counter++;
				else {
					output.append(charInput[i]);
					if(counter>1) {
						output.append(counter);
						counter=1;
					}
				}
			}else {
				output.append(charInput[i]);
				if(counter>1) {
					output.append(counter);
					counter=1;
				}
			}
		}
		System.out.println(output.toString());
	}

}
