class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String n1 = "";
        String n2 = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i]%2==0) n2 += Integer.toString(num_list[i]);
            else n1 += Integer.toString(num_list[i]);
        }
        answer = Integer.parseInt(n1)+Integer.parseInt(n2);
        return answer;
    }
}