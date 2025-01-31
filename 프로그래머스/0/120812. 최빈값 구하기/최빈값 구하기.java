
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1001];
        
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        
        int max = 0;
        for(int i = 0; i < count.length; i++){
            if(max < count[i]){
                max = count[i];
                answer = i;
            }
            else if(max==count[i])
                answer = -1;
        }
        return answer;
    }
}