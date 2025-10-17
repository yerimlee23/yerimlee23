import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		
		for (int i = 0; i < 2; i++) {
			while (n < N) {
				for (int j = 0; j < N; j++) {
					sb.append("@@@@@");
				}
				sb.append("\n");
				n++;
			}
			
			n = 0;
			
			while (n < N) {
				for (int j = 0; j < N; j++) {
					sb.append("@");
				}
				sb.append("\n");
				n++;
			}
			
			n = 0;
		}
		
		while (n < N) {
			for (int j = 0; j < N; j++) {
				sb.append("@@@@@");
			}
			sb.append("\n");
			n++;
		}
		
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
	}
}