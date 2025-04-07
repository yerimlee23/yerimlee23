import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int count = 0;
            
            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if (arr[j] == 0) count++;
            }
            
            if (count == 1) bw.write("A\n");
            else if (count == 2) bw.write("B\n");
            else if (count == 3) bw.write("C\n");
            else if (count == 4) bw.write("D\n");
            else if (count == 0) bw.write("E\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}