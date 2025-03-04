import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 특정 날짜의 요일 구하기 LocalDate.of( 2016, a, b ).getDayOfWeek()
        // toString().substring(0,3) 요일에서 앞 3글자만 출력하기 위해서
        answer = LocalDate.of( 2016, a, b ).getDayOfWeek().toString().substring(0,3);
        return answer;
    }
}