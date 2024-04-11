package com.itwill.file07;

import java.util.*;

public class Main {
    static int N;
    static int[] team1, team2;
    static int[] answer;
    static long minDiff = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        team1 = new int[N];
        team2 = new int[N];
        answer = new int[N];

        for (int i = 0; i < N; i++) {
            team1[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            team2[i] = scanner.nextInt();
        }

        dfs(0, 0, 0, 0);

        for (int i = 0; i < N; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    static void dfs(int idx, int cnt1, int cnt2, long diff) {
        if (idx == N) {
            if (Math.abs(diff) < minDiff) {
                minDiff = Math.abs(diff);
                for (int i = 0; i < N; i++) {
                    answer[i] = (diff & (1 << i)) != 0 ? 1 : 2;
                }
            }
            return;
        }

        dfs(idx + 1, cnt1 + 1, cnt2, diff + team1[idx] - team2[idx]);
        dfs(idx + 1, cnt1, cnt2 + 1, diff - team1[idx] + team2[idx]);
    }
}
