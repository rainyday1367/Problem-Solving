class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 문자열에서, 모음을 제거하여 새로운 문자열에 담아주기
        // 문자열 사칙연산을 사용하면 간단할듯
        for (int i = 0; i < my_string.length(); i++){
            if(!(my_string.charAt(i) == 'a' || my_string.charAt(i) == 'e' ||
                 my_string.charAt(i) == 'i' || my_string.charAt(i) == 'o' ||
                my_string.charAt(i) == 'u'))
                answer += my_string.charAt(i) + "";
            }
        return answer;
    }
}