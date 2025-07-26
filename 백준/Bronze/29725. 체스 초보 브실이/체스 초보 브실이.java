import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		char[][] ch = new char[8][8];
		int white = 0;
		int black = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				ch[i][j] = (char) br.read();
				
				if (ch[i][j] == 'P') white++;
				else if (ch[i][j] == 'p') black++;
				else if (ch[i][j] == 'N' || ch[i][j] == 'B') white += 3;
				else if (ch[i][j] == 'n' || ch[i][j] == 'b') black += 3;
				else if (ch[i][j] == 'R') white += 5;
				else if (ch[i][j] == 'r') black += 5;
				else if (ch[i][j] == 'Q') white += 9;
				else if (ch[i][j] == 'q') black += 9;
			}
			br.readLine();
		}
		br.close();
		
		bw.write(white - black + "");
		bw.flush();
		bw.close();
	}
}