package com.mostfa.saad.training.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author fathyelshemy
 * @category MostafaSaadSheet/a
 * @see https://codeforces.com/contest/25/problem/A
 *
 */
public class IQTest {

	public static void main(String[] args) {

		List<Integer>input=takeInput();
		int output=findRelationShip(input);
		System.out.println(output+1);
	}

	private static List<Integer>takeInput(){
		Scanner scan= new Scanner(System.in);
		int size=Integer.parseInt(scan.nextLine());
		List<Integer>input=new ArrayList<>(size);
		for(int i=0;i<size;i++) {
			input.add(scan.nextInt());
		}
		return input;
	}

	private static int findRelationShip(List<Integer>input) {
		List<Integer>eveness=findEvenRelatioinShip(input);
		List<Integer>oddess=findOddRelationShip(input);
		if(eveness.size()>oddess.size()) {
			return oddess.get(0);
		}else {
			return eveness.get(0);
		}

	}

	private static List<Integer>findEvenRelatioinShip(List<Integer>input){
		List<Integer> eveness= new ArrayList<>();
		for(int i=0;i<input.size();i++) {
			if(input.get(i)%2==0) {
				eveness.add(i);
			}
		}
		return eveness;
	}

	private static List<Integer>findOddRelationShip(List<Integer>input){
		List<Integer>oddess= new ArrayList<>();
		for(int i=0;i<input.size();i++) {
			if(input.get(i)%2==1) {
				oddess.add(i);
			}
		}
		return oddess;
	}
}
