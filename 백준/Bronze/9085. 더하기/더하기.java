import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		int[] arr = new int[tc];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			int sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i]; j++) {
				sum += Integer.parseInt(st.nextToken()); 
			}
			
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}