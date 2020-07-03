package com.mostfa.saad.training.a;

import java.util.Scanner;

public class CircleLine {


	private static int takeArray(int a[]) {
		int counter=0,n=a.length;
		for(int i=0;i<n;i++) {
			counter+=a[i];
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int s=scan.nextInt();
		int t=scan.nextInt();

		int sum=takeArray(a);
		int sumSet=0;
		if(s>t) {
			sumSet=sumSet(a, t, s);
		}else if(s==t){
			sumSet=0;
		}else {
			sumSet=sumSet(a, s, t);
		}
		int shortestPath=(sumSet>(sum-sumSet))? (sum-sumSet):sumSet;
		System.out.println(shortestPath);
	}

	private static int sumSet(int []a, int start, int end) {
		int sumSet=0;
		for(int i=start-1;i<end-1;i++) {
			sumSet+=a[i];
		}
		return sumSet;
	}
}
