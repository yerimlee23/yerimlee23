import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int i = 0; i < N; i++) {
            bw.write(numbers[i] + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}