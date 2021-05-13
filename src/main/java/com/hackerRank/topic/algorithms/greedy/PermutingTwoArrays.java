package com.hackerRank.topic.algorithms.greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PermutingTwoArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q= Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0,q).forEach(i->{
            try {
                String[] multipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(multipleInput[0]);
                int k = Integer.parseInt(multipleInput[1]);
                List<Integer> A = Stream
                        .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> B= Stream
                        .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());
                String result = Result.twoArrays(k, A, B);
                System.out.println(result);
                bufferedReader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
    }
    static class Result {
        /*
         * Complete the 'twoArrays' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER k
         *  2. INTEGER_ARRAY A
         *  3. INTEGER_ARRAY B
         */

        public static String twoArrays(int k, List<Integer> a, List<Integer> b) {
            String result="NO";
            a.sort(Integer::compareTo);
            Collections.sort(b,Collections.reverseOrder());
            for(int i=0;i<a.size();i++){
                if(a.get(i)+b.get(i)>=k)
                    result="YES";
                else{
                    result="NO";
                    break;
                }
            }
            return result;
        }
    }

}
