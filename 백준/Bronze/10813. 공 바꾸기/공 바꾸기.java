import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken()) - 1;
            int b = Integer.parseInt(st2.nextToken()) - 1;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + " ");
        }

        br.close();
        bw.close();
    }
}