import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int resultX, resultY;

        if (x[0] == x[1]) {
            resultX = x[2];
        } else if (x[0] == x[2]){
            resultX = x[1];
        } else {
            resultX = x[0];
        }

        if (y[0] == y[1]) {
            resultY = y[2];
        } else if (y[0] == y[2]){
            resultY = y[1];
        } else {
            resultY = y[0];
        }

        bw.write(resultX + " " + resultY + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}