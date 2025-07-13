class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int endLength = my_string.length();
        int startLength = my_string.length() - n;
        
        answer = my_string.substring(startLength, endLength);
        return answer;
    }
}