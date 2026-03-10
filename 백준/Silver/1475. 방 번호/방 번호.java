import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String str = br.readLine();
		
		int[] set = new int[10];
		
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - '0';
			
			if (n == 9)
				set[6]++;
			else
				set[n]++;
		}
		
		set[6] = (set[6] + 1) / 2;
		int count = 0;
		
		for (int i = 0; i < set.length; i++) {
			count = Math.max(count, set[i]);
		}
		
		bw.write(count + "");
		bw.flush();
	}
}