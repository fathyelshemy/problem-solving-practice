package com.hackerRank.topic.algorithms.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MaxPerimeterTriangle {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Collections.sort(sticks, Collections.reverseOrder());
        for (int i = 0; i < sticks.size() - 2; i++) {
            if (sticks.get(i) < sticks.get(i + 1) + sticks.get(i + 2)) {
                result.addAll(Arrays.asList(sticks.get(i + 2), sticks.get(i + 1), sticks.get(i)));
                break;
            }
        }
        if (result.isEmpty())
            result.add(-1);

        return result;
    }
}

public class MaximumPerimeterTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = MaxPerimeterTriangle.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}

