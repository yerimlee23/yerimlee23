import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    bw.write(arr[j][i]);
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}