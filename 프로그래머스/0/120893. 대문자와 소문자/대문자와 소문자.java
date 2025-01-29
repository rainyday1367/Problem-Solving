class Solution {
    public String solution(String my_string) {
        // int + char = int가 되버리는 문제가 발생
        // Character 메소드 사용메소드 사용
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z')
                answer += Character.toLowerCase(my_string.charAt(i));
            else
                answer += Character.toUpperCase(my_string.charAt(i));
        }
        return answer;
    }
}