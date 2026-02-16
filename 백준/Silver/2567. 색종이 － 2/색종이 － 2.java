import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 색종이 수
		int[][] map = new int[101][101]; // 도화지 크기

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					map[j][k] = 1;
				}
			}
		}

		int len = 0; // 색종이 둘레

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 1) { // 색종이 영역일 때
					// 북동남서
					int[] dr = { -1, 0, 1, 0 }; // 행(위아래)
					int[] dc = { 0, 1, 0, -1 }; // 열(좌우)

					for (int k = 0; k < 4; k++) { //좌표 주변 사방 탐색
						int nr = i + dr[k]; //다음 행 좌표
						int nc = j + dc[k]; //다음 열 좌표

						if (nr < 0 || nr >= map.length || nc < 0 || nc >= map.length || map[nr][nc] == 0) { //사방 탐색했을 때 도화지나 색종이 영역이 아니라면
							len++; //색종이 둘레이다
						}
					}
				}
			}
		}

		bw.write(len + "");
		bw.flush();
	}
}