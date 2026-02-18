import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int tc = 1; tc <= 10; tc++) {
			int t = Integer.parseInt(br.readLine());
			int[][] map = new int[100][100];
			int r = 99;
			int c = 0;
			
			for (int i = 0; i < map.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < map.length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					
					if (map[i][j] == 2) //도착점 찾기
						c = j;
				}
			}
			
			while (r > 0) {
				if (0 <= c - 1 && map[r][c - 1] == 1) { //왼쪽 탐색
					while (0 <= c - 1 && map[r][c - 1] == 1) {
						c--;
					}
				} else if (c + 1 < 100 && map[r][c + 1] == 1) { //오른쪽 탐색
					while (c + 1 < 100 && map[r][c + 1] == 1) {
						c++;
					}
				}
				
				r--; //좌우 이동이 끝났거나 더 이상 갈 곳이 없을 때
			}
			
			bw.write("#" + tc + " " + c + "\n");
		}
		
		bw.flush();
	}
}