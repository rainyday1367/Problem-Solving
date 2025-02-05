class Solution {
    public int solution(int num, int k) {
        // 문자열로 바꾼 후, 해당 인덱스 위치 파악하기
        int answer = 0;
        String str = num + "";
        String idx = k + "";
        if (str.indexOf(idx) != -1) {
            answer = str.indexOf(idx) + 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}