import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        br.close();

        int len = 64;
        int count = 0;

        while (0 < X && X <= 64) {
            if (len > X) {
                len /= 2;
            } else {
                X -= len;
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}