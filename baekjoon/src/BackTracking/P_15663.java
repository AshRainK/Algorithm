package BackTracking;

import java.util.*;
import java.io.*;

class P_15663 {
    static int N, M;
    static int[] answer;
    static int[] arr;
    static boolean[] check;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new int[M];
        check = new boolean[N];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int count) {
        if (count == M) {
            for (int i = 0; i < M; i++) {
                sb.append(answer[i]).append(" ");

            }
            sb.append("\n");
            return;
        } else {
            int before = 0;
            for (int i = 0; i < N; i++) {
                if (check[i]) {  // 뽑았던 값이면
                    continue;
                } else if (before != arr[i] ) {
                    check[i] = true;
                    answer[count] = arr[i];
                    before = arr[i];
                    dfs(count + 1);
                    check[i] = false;
                }
            }
        }
    }
}