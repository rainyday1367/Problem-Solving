import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        // 기존 array에 n을 전부 뺀 다음에,
        // 절대값 씌어서 빼기 값이 제일 작은 것을 answer로 리턴
        // 문제점, 기존 값을 찾을 수 없음
        // 결국 변수 2개를 만들어 (최솟값 체크 변수, 기존 배열 값 살리는 보관용 변수)
        int answer = 0;
        int mn = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int origin = array[i];
            array[i] = Math.abs(array[i] - n);
            if (mn > array[i]) {
                mn = array[i];
                answer = origin;
            }
        }
        return answer;
    }
}