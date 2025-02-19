import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 출발 지점은 여러 개가 될 수 있음
public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static Queue<Node> queue;
    static int cur_x, cur_y;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0;
        arr = new int[m + 1][n + 1];
        visited = new boolean[m + 1][n + 1];
        queue = new LinkedList<>();

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // BFS 시작 구문
        // 열이 x값으로 행이 y값으로
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1) {
                    queue.offer(new Node(j, i));
                    visited[i][j] = true;
                }
            }
        }

        bfs(m, n);
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 0) {
                    max = -1;
                    System.out.println(max);
                    return;
                }
                else if (arr[i][j] >= 1) {
                    max = Math.max(max, arr[i][j]);
                }
            }
        }
        System.out.println(max - 1);
    }
    // bfs 시작
    private static void bfs(int m, int n) {
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int cur_x = cur.x + dirX[i];
                int cur_y = cur.y + dirY[i];

                if (cur_x < 1 || cur_y < 1 || cur_x > n || cur_y > m){
                    continue;
                }

                if(visited[cur_y][cur_x] || arr[cur_y][cur_x] == -1) {
                    continue;
                }
                if(arr[cur_y][cur_x] == 0 && !visited[cur_y][cur_x]){
                    arr[cur_y][cur_x] = arr[cur.y][cur.x] + 1;
                    queue.offer(new Node(cur_x, cur_y));
                    visited[cur_y][cur_x] = true;
                }
            }
        }
    }
}

