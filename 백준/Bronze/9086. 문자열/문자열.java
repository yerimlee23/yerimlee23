import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            if (s.length() > 0) {
                bw.write(s.charAt(0));
                bw.write(s.charAt(s.length() - 1));
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}