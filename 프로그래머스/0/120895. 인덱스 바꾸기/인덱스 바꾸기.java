class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        char temp = charArray[num1];  // num1 위치의 문자 저장
        charArray[num1] = charArray[num2];  // num2 위치의 문자로 변경
        charArray[num2] = temp;  // num1 위치에 원래 num2 문자를 저장
        return new String(charArray); // 변경된 문자 배열을 다시 문자열로 변환
    }
}
