package com.com.hackerRank.topic.algorithms;

import java.util.Scanner;

public class CountingValleys {
    /**
     * @Auther Fathy Elshemy
     * @Link n https://www.hackerrank.com/challenges/counting-valleys/problem
     *
     */

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for (char c : s.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && c == 'U')
                ++v;
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nSize = input.nextInt();
        input.nextLine();
        String walksStep=input.nextLine();

        System.out.println(countingValleys(nSize,walksStep));
    }
}
