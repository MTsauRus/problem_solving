package ssafy_task.samsung_study;

import java.io.*;
import java.util.*;

public class day1_아기고래의첫항해 {
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, };
    static int[] dd = {0, -1, }
    static int[][] board;
    static boolean[][] visited[];
    static int r, c, d;
    static int remains;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.nextToken());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken())-1;
        c = Integer.parseInt(st.nextToken())-1;
        d = Integer.parseInt(st.nextToken())-1;

        board = new int[N][N];
        visited = new boolean[N][N];
        remains = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int next = Integer.parseInt(st.nextToken());
                board[i][j] = next;
                if (next == 0) {
                    remains++;
                }
            }
        }

        visited[r][c] = true;

        while (remains-->0) {
            boolean go = false;
            // 주변에 갈 칸 있는지 탐색
            for (int i = 0; i < 4; i++) {
                int nd = (d + i) % 4;
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                
                if (nr < 0 || nc < 0 || nr >= N || nc > N) continue;
                
            }

            // go = false면 진행, 2번이동
        }
    }
}