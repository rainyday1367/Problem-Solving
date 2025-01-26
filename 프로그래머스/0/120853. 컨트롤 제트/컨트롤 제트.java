class Solution {
    public int solution(String s) {
        // 문자열을 자를 필요가 있음
        // split 사용
        // String 배열을 담아 split으로 자르고, 그것들을 담는다.
        // 문제는 공백으로 주어졌다.
        
        String[] arr = s.split(" ");
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i - 1]);
            }
            else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}