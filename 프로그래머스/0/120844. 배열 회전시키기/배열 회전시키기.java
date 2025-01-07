class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = numbers;
        if(direction.equals("left")){
            int temp = answer[0];
            for(int i = 1; i < answer.length; i++){
                answer[i - 1] = answer[i];
            }
            answer[answer.length - 1] = temp;
        } else {
            int temp = answer[answer.length - 1];
            for(int i = answer.length - 1; i > 0; i--){
                answer[i] = answer[i - 1];
            }
            answer[0] = temp;
        }
        
        return answer;
    }
}