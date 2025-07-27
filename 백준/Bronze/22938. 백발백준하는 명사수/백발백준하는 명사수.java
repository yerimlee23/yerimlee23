import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X1 = Integer.parseInt(st.nextToken());
		int Y1 = Integer.parseInt(st.nextToken());
		int R1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int X2 = Integer.parseInt(st.nextToken());
		int Y2 = Integer.parseInt(st.nextToken());
		int R2 = Integer.parseInt(st.nextToken());
		br.close();
		
		double num1 = Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2);
		double num2 = Math.pow(R1 + R2, 2);
		
		if (num1 < num2) bw.write("YES");
		else bw.write("NO");
		bw.flush();
		bw.close();
	}
}