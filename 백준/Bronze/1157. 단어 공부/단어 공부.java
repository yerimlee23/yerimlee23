import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] arr = new int[26];
        int count = 0;
        char ch = '?';

        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                arr[input.charAt(i) - 'A']++;
            } else {
                arr[input.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];
                ch = (char) (i + 'A');
            } else if (arr[i] == count) {
                ch = '?';
            }
        }

        bw.write(ch + "\n");
        bw.flush();
    }
}