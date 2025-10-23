import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> clothes = new HashMap<>();
			
			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String type = st.nextToken();
				
				clothes.put(type, clothes.getOrDefault(type, 0) + 1);
			}
			
			int count = 1;
			
			for (int value : clothes.values()) {
				count *= value + 1;
			}
			
			count -= 1;
			bw.write(count + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}