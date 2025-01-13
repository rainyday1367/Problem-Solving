class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 1;
        for(int i = 0; i < k; i++){
            //System.out.println(idx);
            answer = idx;
            if(idx + 2 > numbers.length){
                idx -= numbers.length - 2;
            } else {
                idx += 2;
            }
        }
        return answer;
    }
}