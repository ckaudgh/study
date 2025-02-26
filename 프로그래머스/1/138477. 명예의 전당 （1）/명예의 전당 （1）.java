import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int j = 0;
        ArrayList<Integer> topscore = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            topscore.add(score[i]);
            Collections.sort(topscore);
            Collections.reverse(topscore);
            if(j<k){
                answer[i]=topscore.get(j);
                j++;
            }
            else answer[i]=topscore.get(k-1);
        }
        
        return answer;
    }
}