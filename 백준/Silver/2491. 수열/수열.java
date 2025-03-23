import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int increase = 1;
        int decrease = 1;
        int max = 1;

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                increase++;
                decrease = 1;
            } else if (arr[i] > arr[i + 1]) {
                decrease++;
                increase = 1;
            } else {
                increase++;
                decrease++;
            }
            max = Math.max(max, Math.max(increase, decrease));
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}