import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = Integer.toString(Integer.parseInt(br.readLine()));
        Integer[] arr = new Integer[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N.length(); i++) {
            bw.write(arr[i] + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}