import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= a; b++) {
				for (int c = b; c <= a; c++) {
					for (int d = c; d <= a; d++) {
						if (a * a * a == (b * b * b) + (c * c * c) + (d * d * d)) {
							bw.write("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")\n");
						}
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}