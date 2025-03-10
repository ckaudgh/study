class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int cnt = 0;
            while (cnt < index) {
                ch = ch == 'z'?'a':(char)(ch+1);
                if (!skip.contains(String.valueOf(ch))) {
                    cnt++;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}