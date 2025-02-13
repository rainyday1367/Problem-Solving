import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // for문 3중으로 굳이 필요없는 index는 돌지 않는 선에서
        // 숫자 기록? 배열로 해서 방문했던 곳은 방문하지 않게끔 코드 설계
        // 다 돌고 나서 min(절댓값) 확인하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        int min = Integer.MAX_VALUE;
        int result = 0;
        int sum = 0;        // 가독성을 올릴 sum 변수 추가
        // 3중 for문 전개
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (min > m - sum && sum <= m) {
                        min = m - sum;
                        result = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
