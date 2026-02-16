import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String[] target = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (String alphabet : target) {
			str = str.replace(alphabet, "*");
		}
		
		bw.write(str.length() + "");
		bw.flush();
	}
}