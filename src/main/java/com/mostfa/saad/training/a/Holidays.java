package com.mostfa.saad.training.a;

import java.util.Scanner;

public class Holidays {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		float n= scan.nextFloat();
		int min=0;
		int max=0;
		for(int i=1;i<=n;i++) {
			if(i==1 || i==2 || i-(5)==1 || i-(5)==2) {
				max++;
			}
			if(i==6 || i==7 || i-(5*(i/7))==6 || i-(5*(i/7))==7) {
				min++;
			}
		}

		System.out.println(min+" "+max);

	}

}

/*
 * 	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		float n= scan.nextFloat();
		float nOfWeeks=n/7;
		if(n>5) {
		int min=(int) ((int)(Math.round(nOfWeeks*1)/1)+(n/7));
		int max=(int) ((Math.round(nOfWeeks*1)/1)*2);
		System.out.println(min+" "+max);
		}else if(n>=2 && n<=5) {
			int min=(int) ((int)(Math.floor(nOfWeeks)));
			int max=(int) ((Math.ceil(nOfWeeks))*2);
			System.out.println(min+" "+max);
		}else if(n==1){
			System.out.println(0+" "+1);
		}else {
			System.out.println(0+" "+0);
		}

	}
 */
