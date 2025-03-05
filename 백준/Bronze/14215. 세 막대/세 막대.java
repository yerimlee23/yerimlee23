import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, Math.max(b, c));
        int remain = a + b + c - max;
        int sum = 0;

        if (max < remain) {
            sum = a + b + c;
        } else {
            sum = 2 * remain - 1;
        }

        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}