import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int tc = 1; tc <= 10; tc++) {
			int t = Integer.parseInt(br.readLine());
			char[][] map = new char[100][100];

			for (int i = 0; i < 100; i++) {
				String str = br.readLine();
				for (int j = 0; j < 100; j++) {
					map[i][j] = str.charAt(j);
				}
			}

			int maxLen = 1; // 최대 회문 길이

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					// 가로 홀수
					int k = 0;
					while (0 <= j - k && j + k < 100 && map[i][j - k] == map[i][j + k]) {
						int len = k * 2 + 1;
						maxLen = Math.max(maxLen, len);
						k++;
					}

					// 가로 짝수
					k = 0;
					while (0 <= j - k && j + k + 1 < 100 && map[i][j - k] == map[i][j + k + 1]) {
						int len = (k + 1) * 2;
						maxLen = Math.max(maxLen, len);
						k++;
					}

					// 세로 홀수
					k = 0;
					while (0 <= i - k && i + k < 100 && map[i - k][j] == map[i + k][j]) {
						int len = k * 2 + 1;
						maxLen = Math.max(maxLen, len);
						k++;
					}

					// 세로 짝수
					k = 0;
					while (0 <= i - k && i + k + 1 < 100 && map[i - k][j] == map[i + k + 1][j]) {
						int len = (k + 1) * 2;
						maxLen = Math.max(maxLen, len);
						k++;
					}
				}
			}
			
			bw.write("#" + t + " " + maxLen + "\n");
		}

		bw.flush();
	}
}