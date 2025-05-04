import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();
        br.close();

        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        long answer = 0;
        long mul = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(color1)) {
                answer += i * 10;
            }

            if (arr[i].equals(color2)) {
                answer += i;
            }

            if (arr[i].equals(color3)) {
                if (i != 0) {
                    mul = (long) Math.pow(10, i);
                } else {
                    mul = 1;
                }
            }
        }

        System.out.println(answer * mul);
    }
}