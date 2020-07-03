package com.vJudge.contest1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boy_or_Girl {

	private static String takeInputString() {
		Scanner scan = new Scanner(System.in);
		String input=scan.next();
		return input;
	}

	private static int findBoyOrGirl(String input) {
		char[] charInput= input.toCharArray();
		Set<String> hashSet= new HashSet<>();
		for(char c:charInput) {
			hashSet.add(String.valueOf(c));
		}
		int distinctChars=hashSet.size();
		return distinctChars;
	}
	private static void printBoyOfGirl(int numOfDistinct) {
		if (numOfDistinct%2==0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
	}
	public static void main(String[] args) {
		String input=takeInputString();
		int numOfDistinct=findBoyOrGirl(input);
		printBoyOfGirl(numOfDistinct);
	}

}
