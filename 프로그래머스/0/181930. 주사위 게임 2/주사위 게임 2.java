class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int s1 = a+b+c;
        int s2 = a*a+b*b+c*c;
        int s3 = a*a*a+b*b*b+c*c*c;
        if(a==b&&a==c) answer = s1*s2*s3;
        else if(a==b||a==c||b==c) answer = s1*s2;
        else answer = s1;
        return answer;
    }
}