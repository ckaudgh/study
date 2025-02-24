import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if (list.indexOf(sum) < 0){  //list.indexOf(a)<0 - list에 a값이 없으면 -1 리턴
                	list.add(sum);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}