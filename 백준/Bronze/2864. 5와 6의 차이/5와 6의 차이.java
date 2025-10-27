import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		br.close();
		
		String minA = a.replace('6', '5');
		String minB = b.replace('6', '5');
		String maxA = a.replace('5', '6');
		String maxB = b.replace('5', '6');
		
		int min = Integer.parseInt(minA) + Integer.parseInt(minB);
		int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}