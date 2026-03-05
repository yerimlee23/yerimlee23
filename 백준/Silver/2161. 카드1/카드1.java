import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while (q.size() != 1) {
			sb.append(q.poll() + " ");
			q.add(q.poll());
		}
		
		sb.append(q.poll());
		
		bw.write(sb + "");
		bw.flush();
	}
}