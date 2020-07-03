package com.vJudge.contest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MachinedSurfaces {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		while(true) {
			int n= Integer.valueOf(scan.nextLine());
			if(n==0) {
				break;
			}
			List<String> inputs= new ArrayList<String>();
			for(int i=0;i<n;i++) {
				inputs.add(scan.nextLine());
			}

			int lowest=9999;
			int totalCounterSapce=0;
			for(int i=0;i<n;i++) {
				int counter=0;
				char [] c=inputs.get(i).toCharArray();
				int lineSize=inputs.get(i).length();
				for(int j=0;j<lineSize;j++) {
					if(c[j]==' ') {
						counter++;
						totalCounterSapce++;
					}
				}
				if(lowest>counter) {
					lowest=counter;
				}
			}
			System.out.println(totalCounterSapce-(lowest*n));
		}

	}

}
