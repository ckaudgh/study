import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        // 0~9 까지 count 하는 배열;
        int[] xcnt = new int[10];
        int[] ycnt = new int[10];
        // x,y에 나온 숫자(idx) 에 해당하는 값 ++
        for(String x : X.split("")) {
            xcnt[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")) {
            ycnt[Integer.parseInt(y)]++;
        }
        // 가장 큰 정수를 만드렁야 하니까 9부터 0까지 반복
        for(int i = 9; i >= 0; i--) {
            while(xcnt[i] > 0 && ycnt[i] > 0) {
                answer.append(i);
                xcnt[i]--;
                ycnt[i]--;
            }
        }
        // 아무것도 없다면 -1
        if("".equals(answer.toString())) return "-1";
        // 처음 숫자가 0이면 0
        if("0".equals(answer.toString().substring(0, 1))) return "0";
        
        return answer.toString();
    }
}