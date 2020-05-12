package com.jarry.baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class $11399 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> withdrawTimes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            withdrawTimes.add(scanner.nextInt());
        }

        Collections.sort(withdrawTimes);
        System.out.println( getSumTakenTimesToWithdraw(withdrawTimes) );
    }

    private static int getSumTakenTimesToWithdraw(List<Integer> withdrawTimes) {
        int eachResult = 0;
        List<Integer> eachTimes = new ArrayList<>();
        for (int withdrawTime: withdrawTimes) {
            eachResult += withdrawTime;
            eachTimes.add(eachResult);
        }
        return eachTimes.stream().mapToInt(d -> d).sum();
    }
}