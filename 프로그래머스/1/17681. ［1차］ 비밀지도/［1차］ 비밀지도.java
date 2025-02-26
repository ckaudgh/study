// class Solution {
//     // binary의 길이가 n보다 작을 경우 앞에 부족한 만큼 0추가
//     public String[] addZero(String bin, int n){
//         if(bin.length()!=n){
//             String zero = "";
//             for(int i=0; i<n-bin.length(); i++) {
//                 zero += "0";
//             }
//             bin = zero + bin;
//         }
//         return bin.split("");
//     }
//     public String[] solution(int n, int[] arr1, int[] arr2) {
//         String[] answer = new String[n];
//         for(int i = 0; i < n; i++){
//             String row = "";
//             String bin1 = Integer.toBinaryString(arr1[i]);
//             String bin2 = Integer.toBinaryString(arr2[i]);
            
//             String[] binary1 = addZero(bin1,n);
//             String[] binary2 = addZero(bin2,n);
            
//             for(int j = 0; j < n; j++){
//                 if(binary1[j].equals("1")||binary2[j].equals("1")) row += "#";
//                 else row += " ";
//             }
//             answer[i] = row;
//         }
//         return answer;
//     }
// }
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            // format으로 %ns 만틈 길이 n만큼 지정 > 부족한 자리수는 0으로, arr1과arr2 둘다 실행
            answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            // replaceAll으로 1은 # 0은 공백으로
            answer[i] = answer[i].replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
  }
}