import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int menu = Integer.parseInt(br.readLine());
		int[] cost = new int[menu];
		
		for (int i = 0; i < menu; i++) {
			cost[i] = Integer.parseInt(br.readLine());
		}
		
		int people = Integer.parseInt(br.readLine());
		int[] select = new int[people];
		
		for (int i = 0; i < people; i++) {
			select[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		int total = 0;
		
		for (int i = 0; i < people; i++) {
			for (int j = 0; j < menu; j++) {
				if (select[i] == j + 1) {
					total += cost[j];
				}
			}
		}
		
		bw.write(total + "\n");
		bw.flush();
		bw.close();
	}
}