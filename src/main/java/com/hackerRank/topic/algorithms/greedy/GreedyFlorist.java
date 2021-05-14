package com.hackerRank.topic.algorithms.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GreedyFlorist {
    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {

        List<Integer> c1= Arrays.stream(c)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        for(int i=0;i<c1.size();i++) {
            int max=1;
            if ((double) i / k >= 1) {
                max += i / k;
                c1.set(i, (c1.get(i) * max));
            }
        }
        return c1.stream().mapToInt(i->i).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        System.out.println(minimumCost);
        scanner.close();
    }


}
