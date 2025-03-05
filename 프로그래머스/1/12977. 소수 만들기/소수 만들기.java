class Solution {
   public int solution(int[] nums) {
      int answer = 0;
      boolean chk = false;

      for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
               int num = nums[i] + nums[j] + nums[k];
                  chk = isPrime(num);
               if (chk == true)
                  answer++; 
            }
         }
      }
      return answer;
   }
   
   public boolean isPrime(int num) {
      boolean check = true; 
      for(int i=2; i<num; i++) { //소수가 아닐때
         if(num%i ==0) {
            check = false;
            break;
         }
      }
      return check;
   }
}