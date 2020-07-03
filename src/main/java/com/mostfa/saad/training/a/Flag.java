package com.mostfa.saad.training.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flag {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt()
			,m=scan.nextInt();
		scan.nextLine();
		List<String> str=new ArrayList<>();
		for(int i=0;i<n;i++) {
				str.add(scan.nextLine());
		}
		int [][] a= converter(str, n, m);
		validateFlag(n, m, a);
	}

	private static int [][] converter(List<String>str,int n, int m) {
		int [][] a= new int [n][m];
		for(int i=0;i<n;i++) {
			char x[]=str.get(i).toCharArray();
			for(int j=0;j<m;j++) {
				a[i][j]=x[j];
			}
		}
		return a;

	}
	private static void validateFlag(int n,int m, int a[][]) {
		int counter=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][0]==a[i][j])
					counter++;
			}
			if(counter>m || counter<m)
				break;
			if((i<n-1)) {
				if((a[i][0]!=a[i+1][0])) {
					counter=0;
				}
			}

		}
		String s=(counter==m)? "YES":"NO";
		System.out.println(s);
	}
}
