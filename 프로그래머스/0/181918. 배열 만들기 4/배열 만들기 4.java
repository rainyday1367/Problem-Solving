import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int idx = 0;
        while(idx < arr.length){
            if(list.size() == 0){
                list.add(arr[idx]);
                idx++;
            } else {
                if(list.get(list.size() - 1) < arr[idx]){
                    list.add(arr[idx]);
                    idx++;
                } else{
                    list.remove(list.size() - 1);
                }
            }
            
        }
        int[] stk = new int[list.size()];
        for(int i = 0; i < stk.length; i++){
            stk[i] = list.get(i);
        }
        return stk;
    }
}