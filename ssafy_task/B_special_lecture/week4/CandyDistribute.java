package ssafy_task.B_special_lecture.week4;

import java.io.*;
import java.util.*;

public class CandyDistribute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
        
            long S = A + B;
            long res = A * mod(2, K, S) % S;
            sb.append("#" + t + " " + Math.min(res, S-res) + "\n");

        } 
        System.out.println(sb);
    }    
    
    static long mod(long A, long K, long mod) {
        long res = 1;
        long base = A % mod;

        while (K > 0) {
            if (K % 2 == 1) { // 지수가 홀수, 현재 자리를 사용한다면
                res = res * base % mod;
            }
            base = base * base % mod;
            K = K / 2;
        }

        return res;
    }
}
