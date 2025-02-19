import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        long result = n * 4;

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}