class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s));
        char[] c = my_string.substring(s, e + 1).toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        sb.append(my_string.substring(e + 1, my_string.length()));
        return sb.toString();
    }
}