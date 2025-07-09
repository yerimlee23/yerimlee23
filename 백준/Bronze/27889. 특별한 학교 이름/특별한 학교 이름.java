import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        br.close();

        if (str.equals("NLCS")) bw.write("North London Collegiate School");
        else if (str.equals("BHA")) bw.write("Branksome Hall Asia");
        else if (str.equals("KIS")) bw.write("Korea International School");
        else if (str.equals("SJA")) bw.write("St. Johnsbury Academy");
        bw.close();
    }
}