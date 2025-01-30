import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] totalArea = new int[100][100]; //전체 영역
        int paperNum = sc.nextInt(); //색종이 개수
        int paperArea = 0; //색종이를 붙인 영역

        for (int i = 0; i < paperNum; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (totalArea[j][k] == 0) { //빈 공간(영역)일 경우
                        totalArea[j][k] = 1; //색종이를 붙인 영역을 1로 표시
                        paperArea++; //색종이를 붙인 영역 1씩 추가
                    }
                }
            }
        }

        System.out.println(paperArea);
    }
}