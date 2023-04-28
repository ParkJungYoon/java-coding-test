package javamaster.programmers.lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java

public class 최댓값과_최솟값 {
    public String solution(String s) {
        String[] new_s = s.split(" ");

        int min, max;
        min = max = Integer.parseInt(new_s[0]);
        for (String ss : new_s) {
            int n = Integer.parseInt(ss);
            if (n < min) {
                min = n;
            } else if (n > max) {
                max = n;
            }
        }
        return min + " " + max;
    }
}
