import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int apple = Integer.parseInt(st.nextToken());
		int banana = Integer.parseInt(st.nextToken());
		br.close();
		
		int min = Math.min(apple, banana);
		
		for (int i = 1; i <= min; i++) {
			if ((apple % i == 0) && (banana % i == 0)) {
				int people = i;
				apple /= i;
				banana /= i;
				bw.write(people + " " + apple + " " + banana + "\n");
			
				apple *= i;
				banana *= i;
			}
		}
		
		bw.flush();
		bw.close();
	}
}