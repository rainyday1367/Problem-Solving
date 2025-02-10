class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int idx : array) {
            if (idx > height) answer++;
        }
        return answer;
    }
}