import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int K;
	static int[][] WV;
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		WV = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			WV[i][0] = Integer.parseInt(st.nextToken());
			WV[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		dp = new int[K + 1];
		
		for (int i = 0; i < N; i++) {
			int weight = WV[i][0];
			int value = WV[i][1];
			
			for (int j = K; j >= weight; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight] + value);
            }
		}
		
		bw.write(dp[K] + "");
		bw.close();
	}
}