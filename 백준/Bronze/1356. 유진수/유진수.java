import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String answer = "NO";

        for (int i = 0; i < num.length(); i++) {
            String div1 = num.substring(0, i + 1);
            String div2 = num.substring(i + 1);

            int calDiv1 = 1, calDiv2 = 1;

            for (int j = 0; j < div1.length(); j++) {
                calDiv1 *= div1.charAt(j) - '0';
            }

            for (int j = 0; j < div2.length(); j++) {
                calDiv2 *= div2.charAt(j) - '0';
            }

            if (num.length() == 1) {
                answer = "NO";
            } else if (calDiv1 == calDiv2) {
                answer = "YES";
                break;
            }
        }

        bw.write(answer);

        br.close();
        bw.flush();
        bw.close();
    }
}