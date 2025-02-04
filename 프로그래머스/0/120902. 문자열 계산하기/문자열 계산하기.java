class Solution {
    public int solution(String my_string) {
        // 공백을 기준으로 자른 후, 숫자면 parsing, +,-로 연산자로 사용
        // 첫번째 수는 어찌됐던 간에, answer의 첫 값이 되는 것이 확실
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            }
            else if (arr[i].equals("-"))
                answer -= Integer.parseInt(arr[i + 1]);
        }
        return answer;
    }
}