import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] exams = new int[N]; //문제 배점
		int[] students = new int[M]; //학생 수험번호
		int[] scores = new int[M]; //학생 점수
		int maxScore = -1; //최고 점수
		int maxStudent = Integer.MAX_VALUE; //최고 점수를 받은 학생 수험번호
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			exams[i] = Integer.parseInt(st.nextToken()); //문제 배점
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			students[i] = Integer.parseInt(st.nextToken()); //학생 수험번호
			
			for (int j = 0; j < N; j++) {
				char check = st.nextToken().charAt(0);
				
				if (check == 'O') {
					scores[i] += exams[j];
				}
			}
			
			maxScore = Math.max(maxScore, scores[i]);
		}
		
		br.close();
		
		for (int i = 0; i < M; i++) {
			if (maxScore == scores[i]) {
				maxStudent = Math.min(maxStudent, students[i]);
			}
		}
		
		bw.write(maxStudent + " " + maxScore);
		bw.flush();
		bw.close();
	}
}