import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        Solution solution = new Solution();
        System.out.println(solution.solution(keymap, targets));
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (map.containsKey(keymap[i].charAt(j))) {
                    Integer cnt = map.get(keymap[i].charAt(j));
                    if (cnt > (j + 1)) {
                        map.put(keymap[i].charAt(j), j + 1);
                    }
                } else {
                    map.put(keymap[i].charAt(j), j + 1);
                }

            }
        }
        
        for(int i=0;i<targets.length;i++){
            int ncnt = 0;
            for(int j=0;j<targets[i].length();j++){
                char ch = (targets[i].charAt(j));
                Integer click = map.get(ch);
                if ( click != null ) {
                    ncnt += click;
                }
                else{
                    ncnt = -1;
                    break;
                }
            }
            answer[i] = ncnt;
        }
        return answer;
    }
}