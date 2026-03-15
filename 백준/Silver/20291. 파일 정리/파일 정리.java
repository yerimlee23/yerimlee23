import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<String, Integer> m = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			int idx = input.lastIndexOf('.');
			
			if (idx != -1) {
				String str = input.substring(idx + 1);
				m.put(str, m.getOrDefault(str, 0) + 1);
            }
		}
		
		ArrayList<String> list = new ArrayList<>(m.keySet());
		StringBuilder sb = new StringBuilder();
		Collections.sort(list);
		
		for (String k : list) {
			sb.append(k + " " + m.get(k) + "\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}