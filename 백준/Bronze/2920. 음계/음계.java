import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        String result = "";

        for (int i = 0; i < 7; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                result = "ascending";
            } else if (arr[i + 1] == arr[i] - 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}