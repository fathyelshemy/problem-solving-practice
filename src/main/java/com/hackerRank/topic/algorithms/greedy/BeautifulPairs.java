package com.hackerRank.topic.algorithms.greedy;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class BeautifulPairs {
    static class Result {

        /*
         * Complete the 'beautifulPairs' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY A
         *  2. INTEGER_ARRAY B
         */

        public static int beautifulPairs(List<Integer> A, List<Integer> B) {
            // Write your code here
            Collections.sort(B);
            Collections.sort(A);
            List<Integer>pairWise=new ArrayList<>();
            for(int i=0;i<A.size();i++){
                int currentElement=A.get(i);
                B.stream()
                        .filter(b-> b==currentElement)
                        .findFirst()
                        .ifPresent(b->{
                            pairWise.add(b);
                            B.remove(b);
                        });
            }

            return (pairWise.size()==A.size()  ) ? pairWise.size()-1:pairWise.size()+1;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.beautifulPairs(A, B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
