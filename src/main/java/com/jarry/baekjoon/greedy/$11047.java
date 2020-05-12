package com.jarry.baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class $11047 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int money = scanner.nextInt();
        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coins.add(scanner.nextInt());
        }

        Collections.reverse(coins);
        System.out.println( getUsingCoinCounts(money, coins) );
    }

    public static int getUsingCoinCounts(int money, List<Integer> coins) {
        int number=0;
        for (int coin : coins) {
            if (money == 0) {
                break;
            }
            if (Math.abs(money/coin) == 0) {
                continue;
            }
            number += money/coin;
            money = money % coin;
        }
        return  number;
    }
}
