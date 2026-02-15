import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); //목표 방 번호
		
		int cur = 1; //현재 위치 (갈 수 있는 방 범위)
		int visit = 1; //방문한 방 개수(1번 방부터 시작하므로 1로 초기화)
		
		while (true) {
			if (cur >= n) {
				break;
			}
			
			cur += 6 * visit;
			visit++;
		}
		 
		bw.write(visit + "");
		bw.flush();
	}
}