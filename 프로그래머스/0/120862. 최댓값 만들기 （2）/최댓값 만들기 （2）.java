import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        Arrays.sort(numbers);
        return numbers[0] * numbers[1] > numbers[n - 2] * numbers[n - 1] 
            ? numbers[0] * numbers[1] : numbers[n-2] * numbers[n-1]; 
    }
}