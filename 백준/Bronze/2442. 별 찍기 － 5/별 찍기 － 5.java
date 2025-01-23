import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 설명.
        *   2차원 배열을 사용
        *   행마다 공백이 줄어들고, 별이 증가함
        *   행은 n이 5일 때,
        *   1행 공백 4개, 별 1개 -> n - 1, 2 * n + 1
        *   2행 공백 3개, 별 2개 -> n - 2
        *   3행 공백 2개, 별 5개 -> n - 3
       * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            // 공백 찍기
            for (int j = 0; j < n - i - 1; j++) {
                bw.write(" ");
            }
            // 별 찍기
            for (int j = 0; j < (2 * i) + 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}