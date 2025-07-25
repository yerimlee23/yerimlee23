import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		br.close();
		
		sb.append(input);
		int count = 0;
		
		for (int i = 0; i < sb.length() - 3; i++) {
			if (sb.charAt(i) == 'D') {
				if (sb.charAt(i + 1) == 'K') {
					if (sb.charAt(i + 2) == 'S') {
						if (sb.charAt(i + 3) == 'H') {
							count++;
						}
					}
				}
			}
		}
		
		bw.write(count + "");
		bw.close();
	}
}