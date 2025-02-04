class Solution {
    public int solution(String[] s1, String[] s2) {
        // 이중 for문?을 써야하나?
        // 비 효율적인데 ㅠㅠ
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j]))
                    answer++;
            }
        }
        return answer;
    }
}