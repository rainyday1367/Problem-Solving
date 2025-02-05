class Solution {
    public String[] solution(String[] quiz) {
        // split으로 문자열을 자른 후, 공백으로 자르면
        // [3 , - , 4, =, -3]
        // 처음부터 다 자르면, quiz의 갯수만큼 연산자의 갯수가 더러워질 정도로 잘라짐
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            // 자르고 나서 1, 3, 5는 숫자 2는 연산자
            int left = arr[1].equals("+") ? Integer.parseInt(arr[0]) + Integer.parseInt(arr[2])
                                          : Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            int right = Integer.parseInt(arr[4]);
            answer[i] = left == right ? "O" : "X";
        }
        return answer;
    }
}