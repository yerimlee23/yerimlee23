import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char ascii = input.charAt(i);
            bw.write((int) ascii + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}