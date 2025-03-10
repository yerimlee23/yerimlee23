import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
        }

        System.out.println(min);
    }
}