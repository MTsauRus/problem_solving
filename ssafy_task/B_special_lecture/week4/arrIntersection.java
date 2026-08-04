package ssafy_task.B_special_lecture.week4;
import java.io.*;
import java.util.*;

public class arrIntersection {
    static int T;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String tmp = br.readLine();
            HashSet<String> setA = new HashSet<>();
            HashSet<String> setB = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                setA.add(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                setB.add(st.nextToken());
            }
            int ans = 0;
            for (String str : setB) {
                if (!setA.add(str)) {
                    ans++;
                }
            }

            sb.append("#" + t + " " + ans + '\n');
        }

        System.out.println(sb);
    }
}
