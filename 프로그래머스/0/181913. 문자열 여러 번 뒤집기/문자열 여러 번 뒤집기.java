class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            // 이제 char를 뒤집는 과정 -> for문을 쓰면 안됌
            // for문을 쓰면 0 ~ 7까지가 안 통과함
            // 어쩔 수 없이 투포인터로 접근
            while (s < e) {
                char temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }
        }
        String answer = new String(arr);
        return answer;
    }
}