import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> list = new ArrayList<>();
        String[] s = {"code","date","maximum","remain"};
        int eIdx=0, sIdx=0;

        for(int i=0; i<4; i++){
            // ext 와 비교후 저장 (val_ext 와 비교를 위한 인덱스 값)
            if(ext.equals(s[i])) eIdx=i;
            // sort_by 와 비교후 저장 (정렬 기준을 위한 인덱스 값)
            if(sort_by.equals(s[i])) sIdx=i;
        }
        final int sort=sIdx;

        for(int i=0; i<data.length; i++){
            // ext와 일치하는 인덱스에 있는 값을 val ext 값과 비교 후 리스트에 추가
            if(data[i][eIdx]<val_ext) list.add(data[i]);
        }
        // lambda, Comparator 사용시 final 이나 effectively final
        // sort 기준 오름차순 정렬 sort(정렬할 리스트,(o1,o2)->o1[정렬기준]-o2[정렬기준]);
        // sort 기준 내림차순 정렬 sort(정렬할 리스트,(o1,o2)->o2[정렬기준]-o1[정렬기준]);
        Collections.sort(list,(o1,o2)->o1[sort]-o2[sort]);

        return list;
    }
}