import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int subway = Integer.parseInt(br.readLine());
		int flight = Integer.parseInt(br.readLine());
		br.close();
		
		if (subway > flight) {
			bw.write("flight");
		} else {
			bw.write("high speed rail");
		}
		
		bw.flush();
		bw.close();
	}
}