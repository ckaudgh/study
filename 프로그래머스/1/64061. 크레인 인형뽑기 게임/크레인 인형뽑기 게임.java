import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new LinkedList<>();
        
        for(int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;
            
            for(int j = 0; j < board.length; j++) {
                if(board[j][column] == 0) continue;
 
                list.add(board[j][column]);
                board[j][column] = 0;
                
                // 같은 인형이 두 개 연속으로 쌓일 경우
                if (list.size() >= 2 && 
                    list.get(list.size() - 1) == list.get(list.size() - 2)) {
                    list.remove(list.size() - 1); // 마지막 인형 제거
                    list.remove(list.size() - 1); // 그 이전 인형 제거
                    answer += 2; // 없어진 인형 수 증가
                }
                
                break;
            }
        }
        
        return answer;
    }
}   