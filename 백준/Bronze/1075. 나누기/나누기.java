import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제는 두 자리 수를 최소값으로 해야한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int result = 0;

        // 로직 작성
        // 기존 숫자의 1의 자릿수와 10의 자릿수를 00으로 바꾸는 작업
        if (n < 10) {
            n *= 100;
        } else if (n < 100) {
            n /= 10;
            n *= 100;
        } else {
            n /= 100;
            n *= 100;
        }

        for (int i = 0; i <= 99; i++) {
            if ((n + i) % f == 0) {
                result = i;
                break;
            }
        }
        if (result < 10) {
            sb.append("0" + result);
        } else {
            sb.append(String.valueOf(result));
        }

        System.out.println(sb);
    }
}
