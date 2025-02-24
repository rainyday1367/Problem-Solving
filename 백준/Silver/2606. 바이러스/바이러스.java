import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    /* 설명 웜 바이러스에 대한 문제, 노드에 방문하면 해당 pc가 감염되는 문제 */
    // bfs 사용을 위한 메소드 분리, 배열(숫자 보관, 방문 표시) 선언

    public static int[][] networkNode;
    public static boolean[] visited;
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        networkNode = new int[computer + 1][computer + 1];
        visited = new boolean[computer + 1];
        int connect = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < connect; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 무연결 그래프에 대한 정보
            networkNode[x][y] = 1;
            networkNode[y][x] = 1;
        }

        dfs(1);

        System.out.println(result - 1);
    }
    public static void dfs(int node) {
        // 이따 다시 짜기
        // bfs가 돌아가는 조건 제시
        visited[node] = true;
        result++;
        for (int i = node; i < networkNode.length; i++) {
            for (int j = 1; j < networkNode[i].length; j++) {
                if (!visited[j] && networkNode[node][j] == 1) {
                    dfs(j);     // 여기다가 1을 넣으면 무한 프르처럼 무한 재귀 -> 스택 오버 플로우 발생
                }
            }
        }

    }
}
