class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];
            
            int min = 1000000;
            for(int j = a; j <= b; j++){
                if(arr[j]>c&&arr[j]<=min) min = arr[j];
            }
            answer[i] = (min!=1000000) ? min : -1;
        }
        return answer;
    }
}