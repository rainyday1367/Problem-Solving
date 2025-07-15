class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String[] builder = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            builder[i] = my_string.substring(0, i);
        }
        
        for (int i = 0; i < builder.length; i++) {
            System.out.println(builder[i]);
            if (builder[i].equals(is_prefix)) answer = 1;
        }
        return answer;
    }
}