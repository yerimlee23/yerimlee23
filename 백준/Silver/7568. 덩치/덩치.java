import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] weights = new int[N];
		int[] heights = new int[N];
		int[] ranks = new int[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			weights[i] = Integer.parseInt(st.nextToken());
			heights[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for (int i = 0; i < N; i++) {
			int rank = 1;
			
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				
				if (weights[j] > weights[i] && heights[j] > heights[i]) {
					rank++;
				}
			}
			
			ranks[i] = rank;
		}
		
		for (int i = 0; i < N; i++) {
			bw.write(ranks[i] + " ");
		}
		
		bw.flush();
		bw.close();
	}
}