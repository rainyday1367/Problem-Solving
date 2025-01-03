class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0; i < answer.length; i++){
            int result = 0;
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j])
                    result++;
            }
            answer[i] = result + 1;
        }
        
        return answer;
    }
}