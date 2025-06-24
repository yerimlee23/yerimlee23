import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (a, b) -> b.length() - a.length());

        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean check = false;

            for (int j = 0; j < i; j++) {
                if (words[j].startsWith(words[i])) {
                    check = true;
                    break;
                }
            }

            if (!check) count++;
        }

        bw.write(count + " ");
        bw.flush();
        bw.close();
    }
}