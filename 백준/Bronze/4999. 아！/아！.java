import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        br.close();

        if (A.length() >= B.length()) {
            bw.write("go");
        } else {
            bw.write("no");
        }
        bw.flush();
        bw.close();
    }
}