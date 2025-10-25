import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] apple = new int[2];
		int[] orange = new int[2];
		
		for (int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			apple[i] = Integer.parseInt(st.nextToken());
			orange[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int count = 0;
		
		if (apple[0] == apple[1]) {
			if (orange[0] == orange[1]) {
				count = 0;
			} else {
				count = Math.min(orange[0], orange[1]);
			}
		}
		
		if (orange[0] == orange[1]) {
			if (apple[0] == apple[1]) {
				count = 0;
			} else {
				count = Math.min(apple[0], apple[1]);
			}
		}
		
		if ((apple[0] != apple[1]) && (orange[0] != orange[1])) {
			count = Math.min(apple[0] + orange[1], apple[1] + orange[0]);
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}