import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[31];

        for (int i = 1; i <= 30; i++) {
            arr[i] = i;
        }

        for (int j = 1; j <= 28; j++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = 0; //n번째 숫자는 0 처리
        }

        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 0) {
                bw.write(arr[i] + "\n");
            }
        }

        br.close();
        bw.close();
    }
}