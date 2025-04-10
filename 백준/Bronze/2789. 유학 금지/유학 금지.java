import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        br.close();

        String remove = "CAMBRIDGE";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (remove.indexOf(ch) != -1) continue;
            sb.append(ch);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}