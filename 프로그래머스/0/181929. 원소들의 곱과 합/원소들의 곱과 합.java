class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int n1 = 1;
        int n2 = 0;
        for(int i = 0; i<num_list.length; i++){
            n1 *= num_list[i];
            n2 += num_list[i];
        }
        if(n1<(n2*n2)) answer = 1;
        else answer = 0;
        return answer;
    }
}