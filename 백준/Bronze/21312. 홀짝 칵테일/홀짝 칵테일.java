import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		br.close();
			
		int best = 1;
		
		if (A % 2 != 0 && B % 2 != 0 && C % 2 != 0) { //모두 홀수
			best = A * B * C;
		} else if (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) { //모두 짝수
			best = A * B * C;
		} else {
			if (A % 2 != 0) best *= A;
			if (B % 2 != 0) best *= B;
			if (C % 2 != 0) best *= C;
		}
	
		bw.write(best + "");
		bw.flush();
		bw.close();
	}
}