import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		br.close();
		
		if (x % 3 == 0) {
			bw.write("S");
		} else if (x % 3 == 1) {
			bw.write("U");
		} else if (x % 3 == 2) {
			bw.write("O");
		}
		bw.close();
	}
}