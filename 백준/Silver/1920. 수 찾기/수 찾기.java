import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arrN = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrN.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		ArrayList<Integer> arrM = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arrM.add(Integer.parseInt(st.nextToken()));
		}
		
		br.close();
		Collections.sort(arrN);
		
		for (int i = 0; i < M; i++) {
			int start = 0;
			int end = N - 1;
			int target = arrM.get(i);
			boolean find = false;
			
			while (start <= end) {
				int mid = (start + end) / 2;
				
				if (target == arrN.get(mid)) {
					find = true;
					break;
				} else if (target > arrN.get(mid)) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			
			if (find) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}