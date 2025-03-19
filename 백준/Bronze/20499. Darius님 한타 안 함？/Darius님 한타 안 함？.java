import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] num = str.split("/");
        br.close();

        int K = Integer.parseInt(num[0]);
        int D = Integer.parseInt(num[1]);
        int A = Integer.parseInt(num[2]);

        if (K + A < D || D == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }
        bw.flush();
        bw.close();
    }
}