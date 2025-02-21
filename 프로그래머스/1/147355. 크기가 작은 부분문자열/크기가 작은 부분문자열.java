class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        long tnum = Long.parseLong(p);
        for(int i = 0; i < t.length()-plen+1; i++){
            long num = Long.parseLong(t.substring(i, i + plen));
            if(num <= tnum) answer ++;
        }
        
        return answer;
    }
}