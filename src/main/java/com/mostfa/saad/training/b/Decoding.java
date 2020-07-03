package com.mostfa.saad.training.b;

import java.util.Scanner;
import java.util.TreeSet;

public class Decoding {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int size=Integer.parseInt(scan.nextLine());
		String encodingStr=scan.nextLine();
		char [] encoded= encodingStr.toCharArray();
		char [] decoded=new char[size];

		if(size%2==1) {
			int middle=(size+1)/2;
			decoded[middle-1]=encoded[0];
			for(int i=1;i<size;i++ ) {
				if(i%2==1) {
					middle=middle-i;
				}else {
					middle=middle+i;
				}
				decoded[middle-1]=encoded[i];
			}
		}else {
			int middle=size/2;
			decoded[middle-1]=encoded[0];
			for(int i=1;i<size;i++ ) {
				if(i%2==1) {
					middle=middle+i;
				}else {
					middle=middle-i;
				}
				decoded[middle-1]=encoded[i];
			}
		}
		System.out.println(new String(decoded));

	}

}
