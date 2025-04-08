import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] supply = new int[3];
        int[] demand = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 3; i++) {
            supply[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 3; i++) {
            demand[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (supply[i] < demand[i]) count += demand[i] - supply[i];
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}