import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] height = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }
        br.close();

        boolean find = false;
        for(int i = 0; i < 9 && !find; i++) {
            for (int j = 1; j < 9; j++) {
                if (sum - height[i] - height[j] == 100) {
                    height[i] = 0;
                    height[j] = 0;
                    find = true;
                    break;
                }
            }
        }

        Arrays.sort(height);
        for (int i = 2; i < 9; i++) {
            bw.write(height[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}