import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        StringBuilder sb = new StringBuilder();
        int[] temp = new int[num.length()];
        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for (int i = 0; i < num.length(); i++) {
            temp[i] = num.charAt(i) - '0';
            sb.append(arr[temp[i]]);
        }

        if (num.equals("0")) {
            sb.delete(0, 2);
        } else {
            if (temp[0] == 0) sb.delete(0, 3);
            else if (temp[0] == 1) sb.delete(0, 2);
            else if (temp[0] == 2 || temp[0] == 3) sb.delete(0, 1);
        }

        System.out.println(sb);
    }
}