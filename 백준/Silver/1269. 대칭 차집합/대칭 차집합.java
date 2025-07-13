import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num1; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num2; i++) {
            int B = Integer.parseInt(st.nextToken());
            if (set.contains(B)) set.remove(B);
            else set.add(B);
        }
        br.close();

        bw.write(set.size() + "");
        bw.close();
    }
}