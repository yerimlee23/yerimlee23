import java.io.*;

public class Main {
	public static int[][] ab = new int[15][15];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		dp();
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			sb.append(ab[k][n]).append('\n');
		}

		System.out.println(sb);
	}
	
	public static void dp() {
		for (int i = 0; i < 15; i++) {
			ab[i][1] = 1;
			ab[0][i] = i;
		}
		
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				ab[i][j] = ab[i][j - 1] + ab[i - 1][j];
			}
		}
	}
}