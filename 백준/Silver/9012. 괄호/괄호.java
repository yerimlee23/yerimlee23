import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] st = new String[T];

        for (int i = 0; i < T; i++) {
            st[i] = br.readLine();
        }
        br.close();

        for (int i = 0; i < T; i++) {
            boolean check = true;
            int num = 0;

            for (int j = 0; j < st[i].length(); j++) {
                if (st[i].charAt(j) == '(') num++;
                else if (st[i].charAt(j) == ')') num--;

                if (num < 0) {
                    check = false;
                    break;
                }
            }

            if (num == 0) bw.write("YES\n");
            else bw.write("NO\n");
        }

        bw.flush();
        bw.close();
    }
}