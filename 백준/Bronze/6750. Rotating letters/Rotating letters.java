import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        br.close();

        char[] letters = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};
        boolean check = true;

        for (int i = 0; i < input.length(); i++) {
            int j = 0;
            for (; j < letters.length; j++) {
                if (input.charAt(i) == letters[j]) break;
            }
            if (j == letters.length) {
                check = false;
                break;
            }
        }

        if (check) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        bw.close();
    }
}