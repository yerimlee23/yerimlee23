import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String user = br.readLine();

            if (user.equals("ENTER")) {
                count += set.size();
                set.clear();
            } else {
                set.add(user); 
            }
        }

        count += set.size();

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}