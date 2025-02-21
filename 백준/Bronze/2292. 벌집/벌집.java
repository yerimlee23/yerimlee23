import java.io.*;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int check = 1;
        int count = 1;

        while (check < N) {
            check += 6 * count;
            count++;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}