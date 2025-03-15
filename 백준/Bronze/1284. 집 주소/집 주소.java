import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String N = br.readLine();
            int sum = 2;

            if (N.equals("0")) {
                break;
            } else {
                for (int i = 0; i < N.length(); i++) {
                    char n = N.charAt(i);
                    if (n == '1') {
                        sum += 2;
                    } else if (n == '0') {
                        sum += 4;
                    } else {
                        sum += 3;
                    }
                }
            }

            bw.write(sum + N.length() - 1 + "\n");
        }

        bw.flush();
        bw.close();
    }
}