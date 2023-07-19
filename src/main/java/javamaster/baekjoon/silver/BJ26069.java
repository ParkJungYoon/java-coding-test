package javamaster.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ26069 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> chongMap = new HashMap<>();
        chongMap.put("ChongChong", true);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            List<String> friends = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                friends.add(st.nextToken());
            }
            if (chongMap.containsKey(friends.get(0))) {
                chongMap.put(friends.get(1), true);
                continue;
            }
            if (chongMap.containsKey(friends.get(1))) {
                chongMap.put(friends.get(0), true);
            }
        }
        System.out.println(chongMap.size());
    }
}
