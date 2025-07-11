import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int TC = Integer.parseInt(br.readLine());
        double[] price = new double[TC];

        for (int i = 0; i < TC; i++) {
            price[i] = Double.parseDouble(br.readLine());
            price[i] *= 0.8;
            String discountPrice = String.format("$%.2f\n", price[i]);
            bw.write(discountPrice);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}