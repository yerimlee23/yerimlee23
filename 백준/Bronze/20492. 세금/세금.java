import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int a = (int) (N * 0.78);
        int b = (int) (N * 0.8 + N * 0.2 *0.78);

        System.out.println(a + " " + b);
    }
}