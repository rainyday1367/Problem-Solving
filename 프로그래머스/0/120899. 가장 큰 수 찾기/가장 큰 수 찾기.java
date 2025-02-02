class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int mx = 0;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (mx < array[i]) {
                mx = array[i];
                idx = i;
            }
        }
        answer[0] = mx;
        answer[1] = idx;
        return answer;
    }
}