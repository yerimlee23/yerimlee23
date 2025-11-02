import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum =0;
		
		for (int i = 0; i < 5; i++) {
			int score = Integer.parseInt(br.readLine());
			
			if (40 <= score && score <= 100) {
				sum += score;
			} else if (0 <= score && score < 40) {
				sum += 40;
			}
		}
		br.close();
		
		int avg = sum / 5;
		
		bw.write(avg + "\n");
		bw.flush();
		bw.close();
	}
}