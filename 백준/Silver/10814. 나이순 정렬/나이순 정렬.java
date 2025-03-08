import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] user = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            user[i][0] = st.nextToken();
            user[i][1] = st.nextToken();
        }

        Arrays.sort(user, (a, b) -> {
            int age1 = Integer.parseInt(a[0]);
            int age2 = Integer.parseInt(b[0]);
            return age1 - age2;
        });

        for (int i = 0; i < N; i++) {
            bw.write(user[i][0] + " " + user[i][1]);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}