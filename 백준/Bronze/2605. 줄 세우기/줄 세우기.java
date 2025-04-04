import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int students = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < students; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (i == 0) {
                list.add(i + 1);
            } else {
                list.add(list.size() - num, i + 1);
            }
        }
        br.close();

        for (int i = 0; i < students; i++) {
            bw.write(list.get(i) + " ");
        }
        bw.flush();
        bw.close();
    }
}