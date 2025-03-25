import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        br.close();

        int rate = (int) ((long) Y * 100 / X);
        int count = -1;

        if (rate >= 99) {
            bw.write(count + "\n");
        } else {
            int a = 1;
            int b = X;

            while (a <= b) {
                int play = (a + b) / 2;
                int newRate = (int) ((long) (Y + play) * 100 / (X + play));

                if (newRate > rate) {
                    count = play;
                    b = play - 1;
                } else {
                    a = play + 1;
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }
}