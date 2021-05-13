package com.hackerRank.topic.algorithms.greedy;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Marcs_Cakewalk {

    static class Result {

        /*
         * Complete the 'marcsCakewalk' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts INTEGER_ARRAY calorie as parameter.
         */
        public static long marcsCakewalk(List<Integer> calorie) {

            calorie.sort(Comparator.reverseOrder());
            long sum=0;
            for(int i=0;i<calorie.size();i++){
                sum+=(calorie.get(i)* (long)Math.pow(2,i));
            }
            // Write your code here
            return sum;
        }


    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> calorie = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            long result = Result.marcsCakewalk(calorie);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }

}
