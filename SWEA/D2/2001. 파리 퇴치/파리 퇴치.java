import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][n];
			int sum = 0;
			int max = 0;
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i = 0; i < n - m + 1; i++) {
				for (int j = 0; j < n - m + 1; j++) {
					sum = 0;
					for (int k = i; k < m + i; k++) {
						for (int l = j; l < m + j; l++) {
							sum += map[k][l];
						}
					}
					
					max = Math.max(sum, max);
				}
			}
			
			bw.write("#" + tc + " " + max + "\n");
		}

		bw.flush();
	}
}