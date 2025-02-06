import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        int maxScore = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());

            if (scores[i] >= maxScore) {
                maxScore = scores[i];
            }
        }

        for (int j = 0; j < N; j++) {
            sum += ((double) scores[j] / maxScore) * 100;
        }

        double average = sum / N;
        bw.write(average + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}