import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] people = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        br.close();

        long count = 0;

        for (int i = 0; i < N; i++) {
            people[i] -= A;
            count++;

            if (people[i] > 0 && people[i] % B == 0) {
                count += people[i] / B;
            } else if (people[i] > 0 && people[i] % B != 0) {
                count += people[i] / B;
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}