import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int clap = 0;
        br.close();
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 3 || digit == 6 || digit == 9){
                    clap++;
                }
                num /= 10;
            }
        }
        StringBuilder sb = new StringBuilder(clap + "");
        System.out.println(sb);
    }
}
