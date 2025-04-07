import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            char[] check = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

            if (str.equals("#")) break;

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                for (char c : check) {
                    if (str.charAt(i) == c) {
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}