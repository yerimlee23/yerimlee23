import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();
		
		int countB = 0;
		int countS = 0;
		int countA = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'B') countB++;
			if (ch == 'S') countS++;
			if (ch == 'A') countA++;
		}
		
		if (countB == countS && countS == countA) {
			bw.write("SCU");
		} else if (countB > countA && countS > countA) {
			bw.write("BS");
		} else if (countB > countS && countA > countS) {
			bw.write("BA");
		} else if (countS > countB && countA > countB) {
			bw.write("SA");
		} else if (countB > countS && countB > countA) {
			bw.write("B");
		} else if (countS > countB && countS > countA) {
			bw.write("S");
		} else if (countA > countS && countA > countB) {
			bw.write("A");
		}
		bw.flush();
		bw.close();
	}
}