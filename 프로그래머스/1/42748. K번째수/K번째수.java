import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //3
        int num = 0;
        
        for(int i = 0; i<commands.length; i++){
            int j = 0;
            int[] list = new int[commands[i][1]-commands[i][0]+1];
            for(int k = commands[i][0]; k <= commands[i][1]; k++){
                list[j++]=array[k-1];
            }
            Arrays.sort(list);
            answer[num++]=list[commands[i][2]-1];
        }
        return answer;
    }
}