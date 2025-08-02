import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String password = br.readLine();
			
			if (6 <= password.length() && password.length() <= 9) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		
		bw.flush();
	}
}