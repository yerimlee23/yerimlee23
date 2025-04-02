import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;

        while (1 < N && N <= 1073741824) {
            if (N % 2 != 0) {
                result = 0;
                break;
            } else {
                N /= 2;
                result = 1;
            }
        }

        if (N == 1) result = 1;

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}