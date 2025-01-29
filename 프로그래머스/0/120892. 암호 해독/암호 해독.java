class Solution {
    public String solution(String cipher, int code) {
        // 배열 index + 1 해서 배수에 숫자들이면 담게 하기
        // 1번, 모듈러 연산으로 해결해보기
        String answer = "";
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        return answer;
    }
}