class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String[] builder = new String[my_string.length()];
        
        int k = 1;
        for (int i = 0; i < my_string.length(); i++) {
            builder[i] = my_string.substring(0, k);
            k++;
        }
        
        for (int i = 0; i < builder.length; i++) {
            if (builder[i].equals(is_prefix)) answer = 1;
        }
        return answer;
    }
}