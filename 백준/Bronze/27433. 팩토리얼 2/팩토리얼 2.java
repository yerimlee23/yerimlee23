import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        long factorial = 1;

        if (N != 0) {
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }
        }

        bw.write(factorial + "");
        bw.flush();
        bw.close();
    }
}

