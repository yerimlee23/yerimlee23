import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<String> set = new HashSet<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			
			if (status.equals("enter"))
				set.add(name);
			else
				set.remove(name);
		}
		
		ArrayList<String> list = new ArrayList<>(set);
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (String name : list) {
			bw.write(name + "\n");
		}
		
		bw.flush();
	}
}