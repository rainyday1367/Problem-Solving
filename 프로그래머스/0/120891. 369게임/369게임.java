class Solution {
    public int solution(int order) {
        // order를 문자열로 바꿔서
        // .contains (boolean) 형태를 확인해서
        // 확인되면 answer ++ 시키고 return -> 이 형태 안됌
        // 그냥 charAt으로 확인 ?
        int answer = 0;
        String orderString = order + "";
        for (int i = 0; i < orderString.length(); i++) {
            if (orderString.charAt(i) == '3' || orderString.charAt(i) == '6' 
                || orderString.charAt(i) == '9') 
                answer++;
        }
        return answer;
    }
}