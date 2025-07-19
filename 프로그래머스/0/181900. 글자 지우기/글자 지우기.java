class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        String answer = "";
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = "";
        }
        
        for (String s : arr) {
            answer += s;
        }
        return answer;
    }
}