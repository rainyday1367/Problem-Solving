import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        // 문자열을 char로 담아서, 해당 부분이 아스키 코드 숫자이면
        // 그것을 int로 형변환해서 배열에 담아서 리턴
        // 가변적인 값이면 좋겠다. ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {
                arr.add((int)my_string.charAt(i) - '0'); 
                // 아스키 코드 값 0에 값을 빼줘야 숫자를 얻을 수 있음
            } 
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}