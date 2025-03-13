import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
       int answer = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i :ingredient) {
			list.add(i);
            // list의 크기가 4 이상이면 반복
			while(list.size() >= 4) {
				int s = list.size();
                // 1 2 3 1 순서가 아니면 break
				if(!(list.get(s-1)==1
					&& list.get(s-2)==3
					&& list.get(s-3)==2
					&& list.get(s-4)==1)) break;
                // 순서가 맞으면 뒤에서 부터 remove
				for(int j=0; j<4; j++) {
					list.remove(list.size() -1);
				}
				answer++;
			}
		}
        return answer;
    }
}