package com;
// this is default class for solve any new problem
// this is default class for solve any new problem

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    static int pageCount(int n, int p) {

        int frontDistance=((p)/2);
        int backDistance=((n/2-p/2));

        return Integer.min(frontDistance,backDistance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nSize = input.nextInt();
        int page=input.nextInt();

        System.out.println(pageCount(nSize,page));


    }
}
