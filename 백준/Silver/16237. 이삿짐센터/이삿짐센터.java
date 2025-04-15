import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] items = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int bag = 0;
        bag += items[4];

        for (int i = 3; i >= 0; i--) {
            while (items[i] > 0) {
                items[i]--;
                int remain = 5 - (i + 1);
                bag++;

                for (int j = i; j >= 0; j--) {
                    while (items[j] > 0 && remain >= j + 1) {
                        items[j]--;
                        remain -= (j + 1);
                    }
                }
            }
        }

        bw.write(bag + "\n");
        bw.flush();
        bw.close();
    }
}