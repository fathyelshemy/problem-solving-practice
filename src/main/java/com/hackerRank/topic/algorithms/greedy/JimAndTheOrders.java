package com.hackerRank.topic.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class JimAndTheOrders {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>> orders = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            try {
                orders.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        List<Integer> result = Result.jimOrders(orders);
        result.forEach(i -> {
            System.out.print(i + " ");
        });
        System.out.println();
        bufferedReader.close();

    }

    static class Result {

        /*
         * Complete the 'jimOrders' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts 2D_INTEGER_ARRAY orders as parameter.
         */

        public static List<Integer> jimOrders(List<List<Integer>> orders) {
            // Write your code here
            Map<Integer, Integer> serviceDuration = new HashMap<>();
            IntStream.range(0, orders.size()).forEach(i -> {
                int serviceWeight = orders.get(i).stream().mapToInt(Integer::intValue).sum();
                serviceDuration.put(i + 1, serviceWeight);
            });
            return serviceDuration.
                    entrySet().
                    stream().
                    sorted(Map.Entry.comparingByValue()).map(Map.Entry::getKey).
                    collect(Collectors.toList());

        }
    }

}
