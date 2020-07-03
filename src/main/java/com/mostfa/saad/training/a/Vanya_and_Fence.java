package com.mostfa.saad.training.a;
import java.util.Scanner;

public class Vanya_and_Fence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int h=input.nextInt();
		int [] friends= new int [n];
		int count=0;
		for(int i=0;i<n;i++){
			friends[i]=input.nextInt();
		}
		for(int i=0;i<n;i++){
			if(friends[i]<=h)
				count=count+1;
			else if(friends[i]>h)
				count=count+2;
		}
		System.out.println(count);

	}

}