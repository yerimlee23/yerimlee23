import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			ArrayList<String> people = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				people.add(st.nextToken());
			}
			
			String start = br.readLine();
			int num = Integer.parseInt(br.readLine());
			
			int startIdx = people.indexOf(start);
			int count = people.size();
			int endIdx = (startIdx + num - 1) % count;
			String winner = people.get(endIdx);
			
			bw.write(winner + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}