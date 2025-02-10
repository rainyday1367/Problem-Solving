class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] arr = new String[array.length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.toString(array[i]);
        }
        for (String str : arr) {
            char[] list = str.toCharArray();
            for (int i = 0; i < list.length; i++) {
                if (list[i] == '7') answer++;
            }
        }
        return answer;
    }
}