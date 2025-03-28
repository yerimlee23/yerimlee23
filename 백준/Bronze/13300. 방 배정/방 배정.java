import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //전체 인원
        int K = Integer.parseInt(st.nextToken()); //방 하나당 최대 인원

        int[][] students = new int[N][N]; //[성별][학년]

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            students[i][0] = Integer.parseInt(st.nextToken()); //[i] -> 0:여학생, 1:남학생
            students[i][1] = Integer.parseInt(st.nextToken()); //[i] -> 0:여학생, 1:남학생
        }

        int[][] count = new int[6][2]; //학년별 인원

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 6; j++) {
                if (students[i][0] == 0 && students[i][1] == j + 1) { //학년별 여학생 수
                    count[j][0]++;
                } else if (students[i][0] == 1 && students[i][1] == j + 1) { //학년별 남학생 수
                    count[j][1]++;
                }
            }
        }

        int room = 0; //필요한 방의 최소 개수

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (count[i][j] > K) {
                    if (count[i][j] % K != 0) {
                        room += count[i][j] / K + 1;
                    } else {
                        room += count[i][j] / K;
                    }
                } else if (1 <= count[i][j] && count[i][j] <= K) {
                    room++;
                }
            }
        }

        bw.write(room +"\n");
        bw.flush();
        bw.close();
    }
}