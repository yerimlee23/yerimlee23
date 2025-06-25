import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[] arr, ans;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 1; i++) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(arr);
        ans = new int[M];
        dfs(0);

        bw.write(sb.toString());
        bw.flush();
    }

    static void dfs(int depth) {
        if (depth == ans.length) {
            for (int N : ans) {
                sb.append(N).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for (int i = 0; i < arr.length; i++) {
            if (before == arr[i]) {
                continue;
            }

            ans[depth] = arr[i];
            before = arr[i];
            dfs(depth + 1);
        }
    }
}