class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for(String str : goal){
            if (idx1 < cards1.length && str.equals(cards1[idx1])) {
                idx1++; // cards1[idx1]에 포함하는 경우 idx1 증가
            } else if (idx2 < cards2.length && str.equals(cards2[idx2])) {
                idx2++; // cards2[idx2]에 포함하는 경우 idx2 증가
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }
        return "Yes";
    }
}