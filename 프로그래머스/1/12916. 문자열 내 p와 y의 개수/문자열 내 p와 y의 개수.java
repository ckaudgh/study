class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='p') pcount++;
            else if(s.charAt(i)=='y') ycount++;
        }
        if(pcount!=ycount) answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}