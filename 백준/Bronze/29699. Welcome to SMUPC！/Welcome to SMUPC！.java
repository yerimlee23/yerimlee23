import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		String str = "WelcomeToSMUPC";
		char answer = 'a';
		
		if (N <= 14) {
			answer = str.charAt(N - 1);
		} else {
			answer = str.charAt((N - 1) % 14);
		}
		
		bw.write(answer + "\n");
		bw.close();
	}
}