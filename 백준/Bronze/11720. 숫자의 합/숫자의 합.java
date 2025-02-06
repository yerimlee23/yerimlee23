import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;

        for (int i = 0; i < caseNum; i++) {
            sum += (int) (numbers.charAt(i) - '0');
        }

        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}