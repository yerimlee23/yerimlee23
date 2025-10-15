import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> players = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			players.add(br.readLine());
		}
		
		if (players.contains("anj")) {
			System.out.println("뭐야;");
		} else {
			System.out.println("뭐야?");
		}
	}
}