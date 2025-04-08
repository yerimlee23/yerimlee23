import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();

        String mul = String.valueOf(A * B * C);
        int[] count = new int[10];

        for (int i = 0; i < mul.length(); i++) {
            char num = mul.charAt(i);
            int digit = num - '0';
            count[digit]++;
        }

        for (int i : count) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}