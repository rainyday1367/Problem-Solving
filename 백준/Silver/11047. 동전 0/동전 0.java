import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, (a, b) -> b - a);

        int result = greedy(arr, k);
        System.out.println(result);
    }

    private static int greedy(Integer[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                continue;
            }

            if (k / arr[i]  == 0) {
                return k / arr[i] + count;
            }

            count += k / arr[i];
            k %= arr[i];
        }
        return count;
    }
}
