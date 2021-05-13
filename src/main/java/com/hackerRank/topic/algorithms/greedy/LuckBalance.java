package com.hackerRank.topic.algorithms.greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LuckBalance {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);
        List<List<Integer>> contests = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            try {
                contests.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int result = Result.luckBalance(k, contests);
        System.out.println(result);
        bufferedReader.close();
    }

    static class Result {


        public static int luckBalance(int k, List<List<Integer>> contests) {
            List<Integer> unimportantContest = new ArrayList<>();
            contests.stream().filter(contest -> contest.get(1) == 0).forEach(contest -> unimportantContest.add(contest.get(0)));
            List<Integer> importantContest = new ArrayList<>();
            contests.stream().filter(contest -> contest.get(1) > 0).forEach(contest -> importantContest.add(contest.get(0)));
            Collections.sort(importantContest, Collections.reverseOrder());
            for (int i = k; i < importantContest.size(); i++) {
                importantContest.set(i, importantContest.get(i) * -1);
            }
            return unimportantContest.stream()
                    .mapToInt(Integer::intValue)
                    .sum()
                    +
                    importantContest.stream()
                            .mapToInt(Integer::intValue)
                            .sum();
        }
    }
}

