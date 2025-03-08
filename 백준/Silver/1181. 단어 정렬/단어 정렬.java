import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        str = Arrays.stream(str).distinct().toArray(String[]::new);

        Arrays.sort(str);
        Arrays.sort(str, (o1, o2) -> o1.length() - o2.length());

        for (int i = 0; i < str.length; i++) {
            bw.write(str[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}