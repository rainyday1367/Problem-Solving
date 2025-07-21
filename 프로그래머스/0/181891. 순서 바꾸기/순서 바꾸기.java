class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int idx = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        int idx_for_num = 0;
        
        for (int i = idx; i < num_list.length; i++) {
            answer[i] = num_list[idx_for_num];
            idx_for_num++;
        }
        return answer;
    }
}