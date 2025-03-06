class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int maxwall=Math.max(wallet[0],wallet[1]);
        int minwall=Math.min(wallet[0],wallet[1]);
        
        while(true){
            int maxbill=Math.max(bill[0],bill[1]);
            int minbill=Math.min(bill[0],bill[1]);
            if(minbill>minwall||maxbill>maxwall){
                if(bill[0]>bill[1]) bill[0]=bill[0]/2;
                else bill[1]=bill[1]/2;
                answer++;
            }
            else break;
        }
        
        return answer;
    }
}