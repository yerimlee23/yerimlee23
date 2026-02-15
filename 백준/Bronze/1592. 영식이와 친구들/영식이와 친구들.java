import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 자리 수
		int end = Integer.parseInt(st.nextToken()); // 종료조건 (공을 end번 받으면 게임 종료)
		int next = Integer.parseInt(st.nextToken()); // 공을 받을 자리 번호

		int[] catchBall = new int[n]; // 공 받은 횟수 배열
		int count = 0; // 공 던지는 전체 횟수
		int curIdx = 0; // 현재 공 받은 자리

		while (true) {
			if (catchBall[curIdx] == end) {
				count--;
				break;
			} else {
				if (catchBall[curIdx] % 2 == 0) { // 공 받은 횟수가 짝수일 때
					curIdx = (curIdx + next) % n;
				} else { // 공 받은 횟수가 홀수일 때
					curIdx = (curIdx - next + n) % n;
				}

				catchBall[curIdx]++;
				count++;
			}
		}

		bw.write(count + "");
		bw.flush();
	}
}