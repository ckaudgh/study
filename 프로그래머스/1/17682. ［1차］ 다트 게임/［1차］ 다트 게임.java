import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int answer = 0;
        int idx = 0;
        String numstr="";
        
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c>='0'&&c<='9'){
                numstr+=String.valueOf(c);
            } else if(c=='S'||c=='D'||c=='T'){
                int num = Integer.parseInt(numstr);
                switch(c) {
                    case 'S' :
                        score[idx++] = (int)Math.pow(num,1);
                        break;
                    case 'D' :
                        score[idx++] = (int)Math.pow(num,2);
                        break;
                    case 'T' :
                        score[idx++] = (int)Math.pow(num,3);
                        break;
                }
                numstr="";
            }
            else{
                if(c=='*'){
                    score[idx-1] *= 2;
                    if(idx-2 >=0) score[idx-2] *= 2;
                }
                else score[idx-1] *= (-1);
            }
            
        }
        for(int n : score){
            answer += n;
        }
        return answer;
    }
}