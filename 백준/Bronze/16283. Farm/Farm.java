import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        br.close();

        int count = 0;
        int result1 = 0;
        int result2 = 0;

        for (int i = 1; i < n; i++) {
            int j = n - i;
            int check = a * i + b * j;
            if (check == w) {
                count++;
                result1 = i;
                result2 = j;
            }
        }

        if (count != 1) {
            bw.write(-1 + "\n");
        } else {
            bw.write(result1 + " " + result2 + "\n");
        }

        bw.flush();
        bw.close();
    }
}