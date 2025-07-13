import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 경우의 수 1, 기존에 나와있는 변의 길이가 가장 큰 경우
        // 경우의 수 2, 저 합보다 작은 변 갯수
        
        Arrays.sort(sides);
        
        // 경우의 수 1
        for (int i = 1; i <= sides[1]; i++) {
            if (sides[0] + i > sides[1]) {
                answer++;
            }
        }
        
        // 경우의 수 2
        int sum = sides[0] + sides[1];
        
        for (int i = sides[1] + 1; i < sum; i++) {
            answer++;
        }
        return answer;
    }
}