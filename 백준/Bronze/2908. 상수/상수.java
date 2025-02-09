import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int answerA = 0, answerB = 0;

        for (int i = 0; i < 3; i++) {
            answerA = answerA * 10 + a % 10;
            a /= 10;
            answerB = answerB * 10 + b % 10;
            b /= 10;
        }

        if (answerA > answerB) {
            bw.write(answerA + "\n");
        } else {
            bw.write(answerB + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}