class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        int j = 1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = j * k;
            j++;
        }
        return answer;
    }
}