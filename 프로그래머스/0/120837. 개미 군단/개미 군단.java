class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 0){
            int first = hp / 5;
            answer += first;
            hp -= 5 * first;
            
            int second = hp / 3;
            answer += second;
            hp -= 3 * second;
            
            for(int i = 0; i < hp; i++){
                answer++;
                hp--;
            }
        }
        return answer;
    }
}