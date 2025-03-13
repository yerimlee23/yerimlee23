import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];

        for (int i = 0; i < T; i++) {
            result[i] = br.readLine();
        }

        br.close();

        for (int i = 0; i < T; i++) {
            int score = 0;
            int count = 0;

            for (int j = 0; j < result[i].length(); j++) {
                if (result[i].charAt(j) == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }

            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
    }
}