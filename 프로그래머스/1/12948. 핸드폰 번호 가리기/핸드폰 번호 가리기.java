// class Solution {
//     public String solution(String phone_number) {
//         String answer = "";
//         for(int i = 0; i < phone_number.length(); i++){
//             if(i<phone_number.length()-4) answer += "*";
//             else answer+=phone_number.charAt(i);
//         }
//         return answer;
//     }
// }
class Solution{
    public String solution(String phone_number){
        char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length-4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
    }
    
    
}
