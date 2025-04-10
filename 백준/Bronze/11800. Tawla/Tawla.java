import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[][] numbers = new int[T][2];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            numbers[i][0] = Integer.parseInt(st.nextToken());
            numbers[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        String result = "";
        String[] str = {"Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};

        for (int i = 0; i < T; i++) {
            if (numbers[i][0] == numbers[i][1]) {
                if (numbers[i][0] == 1) result = "Habb Yakk";
                else if (numbers[i][0] == 2) result = "Dobara";
                else if (numbers[i][0] == 3) result = "Dousa";
                else if (numbers[i][0] == 4) result = "Dorgy";
                else if (numbers[i][0] == 5) result = "Dabash";
                else if (numbers[i][0] == 6) result = "Dosh";
            } else {
                int max = Math.max(numbers[i][0], numbers[i][1]);
                int min = Math.min(numbers[i][0], numbers[i][1]);

                if (max == 6 && min == 5) result = "Sheesh Beesh";
                else result = str[max - 1] + " " + str[min - 1];
            }
            bw.write("Case " + (i + 1) + ": " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
}