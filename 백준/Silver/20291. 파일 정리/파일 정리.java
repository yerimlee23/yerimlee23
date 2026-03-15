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
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == '.') {
					String str = "";
					for (int k = j + 1; k < input.length(); k++) {
						str += input.charAt(k);
					}
					
					m.put(str, m.getOrDefault(str, 0) + 1);
				}
			}
		}
		
		ArrayList<String> list = new ArrayList<>(m.keySet());
		StringBuilder sb = new StringBuilder();
		Collections.sort(list);
		
		for (String k : list) {
			int count = m.get(k);
			sb.append(k + " " + count + "\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}