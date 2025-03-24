import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(numbers);

        int N = 0;
        if (count == 1) {
            N = numbers[0] * numbers[0];
        } else {
            N = numbers[0] * numbers[count - 1];
        }

        bw.write(N + "\n");
        bw.flush();
        bw.close();
    }
}