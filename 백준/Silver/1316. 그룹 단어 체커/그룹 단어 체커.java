import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (isGroupWord()) count++;
        }

        bw.write(count + "");
        bw.flush();
    }

    public static boolean isGroupWord() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int current = str.charAt(i);

            if (current != prev) {
                if (!check[current - 'a']) {
                    check[current - 'a'] = true;
                    prev = current;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}