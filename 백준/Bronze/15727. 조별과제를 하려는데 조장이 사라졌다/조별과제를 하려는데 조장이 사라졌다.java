import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int time = 0;
		
		if (N % 5 != 0) {
			time = N / 5 + 1;
		} else {
			time = N / 5;
		}
		
		bw.write(time + "\n");
		bw.close();
	}
}