import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int TC = Integer.parseInt(br.readLine());

        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken()); //학생수
            int[] scores = new int[students]; //점수
            int sum = 0; //합계

            for (int j = 0; j < students; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            double avg = (double) sum / students;
            int highStudents = 0; //평균 이상 학생수

            for (int k = 0; k < students; k++) {
                if (scores[k] > avg) {
                    highStudents++;
                }
            }

            double rate = (double) highStudents / students * 100;
            String result = String.format("%.3f", rate);
            bw.write(result + "%\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

