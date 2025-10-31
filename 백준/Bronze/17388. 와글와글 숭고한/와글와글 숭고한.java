import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		br.close();
		
		if (a + b + c >= 100) {
			bw.write("OK");
		} else {
			int min = Math.min(a, Math.min(b, c));
			String name = "";
			
			if (min == a) name = "Soongsil";
			else if (min == b) name = "Korea";
			else if (min == c) name = "Hanyang";
			
			bw.write(name);
		}
		
		bw.flush();
		bw.close();
	}
}