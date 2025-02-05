import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        // 가변 리스트를 사용해, 배수인 것만 추가하고, 배열로 바꾸기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}