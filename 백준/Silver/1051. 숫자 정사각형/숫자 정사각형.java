import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		br.close();
		
		int len = Math.min(N, M);
		
		while(len > 0) {
			for (int i = 0; i <= N - len; i++) {
				for (int j = 0; j <= M - len; j++) {
					int num = arr[i][j];
					
					if (num == arr[i][j + len - 1] && num == arr[i + len - 1][j] && num == arr[i + len - 1][j + len - 1]) {
						bw.write(len * len + "");
						bw.flush();
						bw.close();
						return;
					}
				}
			}
			
			len--;
		}
	}
}