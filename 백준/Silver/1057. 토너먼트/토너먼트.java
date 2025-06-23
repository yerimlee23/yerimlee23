import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int Kim = Integer.parseInt(st.nextToken());
        int Im = Integer.parseInt(st.nextToken());

        int count = 0;

        while (N > 0 && Kim > 0 && Im > 0) {
            N /= 2;

            if (Kim == 1 && Im == 2) {
                count++;
                Kim--;
                Im--;
                break;
            } else if (Kim == Im) {
                break;
            } else {
                if (Kim % 2 != 0) {
                    Kim = Kim / 2 + 1;
                } else {
                    Kim /= 2;
                }

                if (Im % 2 != 0) {
                    Im = Im / 2 + 1;
                } else {
                    Im /= 2;
                }

                count++;
            }
        }

        bw.write(count + " ");
        bw.flush();
        bw.close();
    }
}