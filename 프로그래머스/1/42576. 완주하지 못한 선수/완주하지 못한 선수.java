import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 해시맵을 선언하여 참가자의 이름을 키로, 이름의 개수를 값으로 저장
        HashMap<String, Integer> map = new HashMap<>();
        
        // participant 배열을 순회하면서 각 참가자의 이름을 해시맵에 저장
        for (String p : participant) {
        
        	// getOrDefault 메서드를 사용하여 이미 해시맵에 존재하는 이름이면 값을 증가시키고,
            // 중복 된 이름이 존재하면 동명이인의 수 만큼 숫자 증가
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // completion 배열을 순회하면서 각 완주자의 이름의 값을 해시맵에서 감소.
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 해시맵을 순회하면서 값이 0이 아닌 키(참가자 이름)를 찾는다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        return answer;
    }
}