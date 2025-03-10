class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int erase = 0, match = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i]==0){
                erase++;
                continue;
            }
            for(int j = 0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]) match++;
            }
        }
        answer[0]=rank(match+erase);
        answer[1]=rank(match);
            return answer;
    }
    public int rank(int num){
        if(num==6)return 1;
        else if(num==5)return 2;
        else if(num==4)return 3;
        else if(num==3)return 4;
        else if(num==2)return 5;
        else return 6;
    }
}