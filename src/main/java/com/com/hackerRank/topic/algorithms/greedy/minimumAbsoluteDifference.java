package com.com.hackerRank.topic.algorithms.greedy;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class minimumAbsoluteDifference {

    static class Result {

        /*
         * Complete the 'minimumAbsoluteDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static int minimumAbsoluteDifference(List<Integer> arr) {
            // Write your code here
            // Write your code here
            Collections.sort(arr);

            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.size()-1;i++) {
                int minValue= Math.abs(arr.get(i)- arr.get(i+1));
                if(minValue<min)
                    min=minValue;
            }
            return min;

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
