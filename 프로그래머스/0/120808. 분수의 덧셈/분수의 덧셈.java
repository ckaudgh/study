class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1 * denom2) + (numer2 * denom1); 
        int denom = denom1 * denom2;
        int max = 0;
        for(int i = 1; i<=num && i<=denom; i++) {
            if(num % i == 0 && denom % i == 0) { 
                max = i;
            }
        }
        
        int[] answer = { num/max, denom/max };
        return answer;
    }
}