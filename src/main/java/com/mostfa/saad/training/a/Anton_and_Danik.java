package com.mostfa.saad.training.a;

import java.util.Scanner;

public class Anton_and_Danik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		String result=input.next();
		int countA=0, countB=0;
		char []splite=result.toCharArray();
		for(int i=0;i<n;i++){
			if(splite[i]=='A')
				countA++;
			else if(splite[i]=='D')
				countB++;
		}
		if(countA>countB)
			System.out.println("Anton");
		else if(countB > countA)
			System.out.println("Danik");
		else
			System.out.println("Friendship");
	}

}
