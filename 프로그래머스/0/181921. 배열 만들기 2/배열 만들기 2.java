import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = l; i<=r; i++){
            String str = i + "";
            Boolean flag = false;
            for(char c : str.toCharArray()){
                if(c != '5' && c != '0'){
                    flag = true;
                }
            }
            if(!flag){
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size() == 0 ? 1 : arr.size()];
        if(answer.length == 1){
            answer[0] = -1;
        } else {
            for(int i = 0; i < arr.size(); i++){
                answer[i] = arr.get(i);
            }
        }
        return answer;
    }
}