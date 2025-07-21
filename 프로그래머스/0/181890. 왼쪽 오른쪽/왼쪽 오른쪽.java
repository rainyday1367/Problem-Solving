import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // "l"을 만나면 왼쪽 자르기 = 0 ~ i (미포함) 
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                // "r"을 만나면 오른쪽 자르기 = i+1 ~ 끝까지
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        // "l"과 "r"을 만나지 않으면 빈 배열 리턴
        return new String[0];
    }
}