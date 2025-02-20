import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]) {
                arrayList.add(arr[i]);
            }
        }

        arrayList.add(arr[arr.length - 1]);

        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}