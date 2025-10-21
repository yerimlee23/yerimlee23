import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr = new int[101][101];
		int area = 0;
		
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			for (int j = a+1; j <= c; j++) {
				for (int k = b+1; k <= d; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		br.close();
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				area += arr[i][j];
			}
		}
		
		bw.write(area + "\n");
		bw.flush();
		bw.close();
	}
}