import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		String str = "";
		
		if (N % 2 != 0) {
			str = "evoLmoCicS";
		} else {
			str = "SciComLove";
		}
		
		bw.write(str);
		bw.close();
	}
}