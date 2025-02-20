class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalCost=0;
        for(int i = 1; i <= count; i++){
            totalCost+=price*i;
        }
        long num = totalCost - money;
        answer = num < 0?0:num;
        return answer;
    }
}