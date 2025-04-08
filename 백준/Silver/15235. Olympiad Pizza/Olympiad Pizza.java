import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = Integer.parseInt(br.readLine());
        int[] pizza = new int[people];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < people; i++) {
            pizza[i] = Integer.parseInt(st.nextToken());
            sum += pizza[i];
        }
        br.close();

        int time = 0;
        int[] result = new int[people];

        while (sum > 0) {
            for (int i = 0; i < people; i++) {
                pizza[i] -= 1;
                time++;

                if (pizza[i] < 0) {
                    time--;
                    continue;
                }

                if (pizza[i] == 0) {
                    result[i] = time;
                }
            }

            sum--;
        }

        for (int i = 0; i < people; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}