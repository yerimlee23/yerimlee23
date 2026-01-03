import java.io.*;
import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        br.close();

        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            count += N.charAt(i) - '0';
        }
        bw.write(count + "\n");
        bw.flush();
	}
}