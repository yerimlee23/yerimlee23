import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] teams;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		teams = new int[N][N];
		visited = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			for (int j = 0; j < N; j++) {
				teams[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		backtrack(0, 0);
		
		bw.write(min + "");
		bw.close();
	}
	
	public static void backtrack (int index, int count) {
		if (count == N / 2) {
			int team1 = 0;
			int team2 = 0;
			
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if (visited[i] && visited[j]) {
						team1 += teams[i][j] + teams[j][i];
					} else if (!visited[i] && !visited[j]) {
						team2 += teams[i][j] + teams[j][i];
					}
				}
			}
			
			min = Math.min(min, Math.abs(team1 - team2));
			return;
		}
		
		for (int i = index; i < N; i++) {
			if (min == 0) return;
			
			if (!visited[i]) {
				visited[i] = true;
				backtrack(i + 1, count + 1);
				visited[i] = false;
			}
		}
	}
}

