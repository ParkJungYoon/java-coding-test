package javamaster.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1890 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n;
//    private static int count;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];
        long[][] dp = new long[n][n];
        dp[0][0] = 1;
//        count = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        bfs();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int jump_count = graph[i][j];

                if (jump_count == 0) break;

                if (i + jump_count < n) {
                    dp[i + jump_count][j] += dp[i][j];
                }
                if (j + jump_count < n) {
                    dp[i][j + jump_count] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
    }

    /**
     * bfs 는 메모리 초과
     */
//    private static void bfs() {
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{0, 0});
//
//        while (!queue.isEmpty()) {
//            int x = queue.peek()[0];
//            int y = queue.peek()[1];
//            queue.poll();
//            if (x == n-1 && y == n-1) {
//                count += 1;
//                continue;
//            }
//            System.out.println(queue);
//
//            int jump_count = graph[x][y];
//            // 메모리 초과 난 이유: jump_count가 0일 때 처리를 안함
//            if (jump_count == 0) continue;
//
//            if (x + jump_count < n) {
//                queue.add(new int[]{x + jump_count, y});
//            }
//            if (y + jump_count < n) {
//                queue.add(new int[]{x, y + jump_count});
//            }
//        }
//    }
}
