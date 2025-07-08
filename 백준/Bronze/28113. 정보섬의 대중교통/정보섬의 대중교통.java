import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //지하철역까지 걷는 시간
        int A = Integer.parseInt(st.nextToken()); //버스 도착시간
        int B = Integer.parseInt(st.nextToken()); //지하철 도착시간
        br.close();

        if (A < B) bw.write("Bus");
        else if (A > B) bw.write("Subway");
        else bw.write("Anything");
        bw.close();
    }
}