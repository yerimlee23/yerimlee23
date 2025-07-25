import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		br.close();
		
		sb.append(S);
		String result = "CE";
		
		if (S.length() > 2 && sb.charAt(0) == '"' && sb.charAt(sb.length() - 1) == '"') {
			if (sb.charAt(1) != ' ' && sb.charAt(sb.length() - 2) != ' ') {
				sb.deleteCharAt(0);
				sb.deleteCharAt(sb.length() - 1);
				result = sb.toString();
			}
		}
	
		bw.write(result);
		bw.close();
	}
}