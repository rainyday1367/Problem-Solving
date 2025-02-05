class Solution {
    public int solution(int n) {
        // while로 수가 0이 나올 때까지?
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}