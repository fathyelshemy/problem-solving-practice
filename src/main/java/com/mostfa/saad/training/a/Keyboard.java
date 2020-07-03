package com.mostfa.saad.training.a;

import java.util.Scanner;

public class Keyboard {

	private static final char[] frequentArray=
		{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		String direction=scan.nextLine();
		String input=scan.nextLine();
		char [] inputstr=input.toCharArray();
		StringBuilder str=new StringBuilder();
		for(int i=0;i<inputstr.length;i++) {
			for(int j=0;j<frequentArray.length;j++) {
				if(inputstr[i]==frequentArray[j]) {
					if(direction.toUpperCase().equals("R")) {
						str.append(frequentArray[j-1]);
					}else if(direction.toUpperCase().equals("L")) {
						str.append(frequentArray[j+1]);

					}
				}
			}
		}
		System.out.println(str);
	}

}
