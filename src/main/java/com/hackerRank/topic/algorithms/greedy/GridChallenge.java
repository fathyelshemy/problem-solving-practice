package com.hackerRank.topic.algorithms.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GridChallenge {
    static class Result {
        private Result() {}
        /*
         * Complete the 'gridChallenge' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING_ARRAY grid as parameter.
         */
        private static List<String> buildSortedGridMatrix(List<String> grid){
            List<String> sortedGrid=new ArrayList<>();
            grid.forEach(gridElement->{
                List<Character> chars=gridElement.chars().mapToObj(char.class::cast).sorted().collect(toList());
                StringBuilder tempBuilder= new StringBuilder();
                chars.forEach(tempBuilder::append);
                sortedGrid.add(tempBuilder.toString());
            });
            return sortedGrid;
        }

        public static String gridChallenge(List<String> grid) {
            // Write your code here
            List<String> sortedGrid=buildSortedGridMatrix(grid);
            List<String> str = rotateMatrixBy90(sortedGrid);
            AtomicReference<String> result= new AtomicReference<>("YES");
            str.forEach(element-> {
                String finalElement=element.chars().mapToObj(c->String.valueOf((char)c)).sorted().collect(joining());
                if(!finalElement.equals(element)){
                    result.set("NO");
                }
            });

            return result.get();
        }

        private static List<String> rotateMatrixBy90(List<String> sortedGrid) {
            List<List<Character>> gridMatrix = getCharMatrix(sortedGrid);
            List<String> str= new ArrayList<>();
            for(int i = 0, j = 0; i< sortedGrid.get(0).length(); i++){
                List<Character> characters=new ArrayList<>();
                while(j< sortedGrid.size()){
                    characters.add(gridMatrix.get(j).get(i));
                    j++;
                }
                j=0;
                StringBuilder tempBuilder= new StringBuilder();
                characters.forEach(tempBuilder::append);
                str.add(tempBuilder.toString());
            }
            return str;
        }

        private static List<List<Character>> getCharMatrix(List<String> sortedGrid) {
            List<List<Character>> gridMatrix= new ArrayList<>();
            for(int i = 0; i< sortedGrid.size(); i++){

                gridMatrix.addAll(
                        Collections.singleton(sortedGrid.get(i)
                                .chars()
                                .mapToObj(char.class::cast)
                                .collect(toList())
                        ));
            }
            return gridMatrix;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                        .collect(toList());

                String result = Result.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }

}
