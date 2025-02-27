import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hset.add(nums[i]);
        }
        if(hset.size()<nums.length/2) answer = hset.size();
        else answer = nums.length/2;
        return answer;
    }
}