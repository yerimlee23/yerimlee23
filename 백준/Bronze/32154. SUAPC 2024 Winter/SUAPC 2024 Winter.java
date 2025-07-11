import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] scoreBoard = {{"11", "A B C D E F G H J L M"}, //1
                                {"9", "A C E F G H I L M"}, //2
                                {"9", "A C E F G H I L M"}, //3
                                {"9", "A B C E F G H L M"}, //4
                                {"8", "A C E F G H L M"}, //5
                                {"8", "A C E F G H L M"}, //6
                                {"8", "A C E F G H L M"}, //7
                                {"8", "A C E F G H L M"}, //8
                                {"8", "A C E F G H L M"}, //9
                                {"8", "A B C F G H L M"} //10
                                };

        int N = Integer.parseInt(br.readLine());
        br.close();

        if (N == 1) bw.write(scoreBoard[0][0] + "\n" + scoreBoard[0][1]);
        else if (N == 2) bw.write(scoreBoard[1][0] + "\n" + scoreBoard[1][1]);
        else if (N == 3) bw.write(scoreBoard[2][0] + "\n" + scoreBoard[2][1]);
        else if (N == 4) bw.write(scoreBoard[3][0] + "\n" + scoreBoard[3][1]);
        else if (N == 5) bw.write(scoreBoard[4][0] + "\n" + scoreBoard[4][1]);
        else if (N == 6) bw.write(scoreBoard[5][0] + "\n" + scoreBoard[5][1]);
        else if (N == 7) bw.write(scoreBoard[6][0] + "\n" + scoreBoard[6][1]);
        else if (N == 8) bw.write(scoreBoard[7][0] + "\n" + scoreBoard[7][1]);
        else if (N == 9) bw.write(scoreBoard[8][0] + "\n" + scoreBoard[8][1]);
        else if (N == 10) bw.write(scoreBoard[9][0] + "\n" + scoreBoard[9][1]);
        bw.close();
    }
}