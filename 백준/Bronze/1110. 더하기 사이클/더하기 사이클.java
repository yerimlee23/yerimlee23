import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int first = N;
        int count = 0;

        do {
            N = (N % 10 * 10) + ((N / 10 + N % 10) % 10);
            count++;

        } while (first != N);

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}