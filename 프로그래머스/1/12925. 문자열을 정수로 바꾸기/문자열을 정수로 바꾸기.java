class Solution {
    public int solution(String str) {
        //int answer = Integer.parseInt(str);
        
        //return answer;
        boolean Sign = true;
            int result = 0;

      for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i); //str ==> char
                if (ch == '-') //앞에 부호가 - 면 Sign flase 아니면 true 마지막에 return (Sign?1:-1)
                    Sign = false;
                else if (ch != '+') // 부호가 +가 아니면 아래 작업 실행
                    result = result * 10 + (ch - '0');
            }
            return (Sign?1:-1) * result;
    }
}
