import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> colCut = new ArrayList<>();
		ArrayList<Integer> rowCut = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		
		colCut.add(0);
		colCut.add(x);
		rowCut.add(0);
		rowCut.add(y);
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(st.nextToken());
			
			if (type == 0) {
				rowCut.add(Integer.parseInt(st.nextToken()));
			} else if (type == 1) {
				colCut.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		Collections.sort(colCut);
		Collections.sort(rowCut);
		
		int maxX = 0;
		int maxY = 0;
		
		for (int i = 0; i < colCut.size()-1; i++) {
			int colLen = colCut.get(i+1) - colCut.get(i);
			maxX = Math.max(maxX, colLen);
		}
		
		for (int i = 0; i < rowCut.size()-1; i++) {
			int rowLen = rowCut.get(i+1) - rowCut.get(i);
			maxY = Math.max(maxY, rowLen);
		}
		
		bw.write(maxX * maxY + "");
		bw.flush();
		bw.close();
	}
}