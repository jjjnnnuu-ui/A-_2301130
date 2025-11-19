import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 학생 정보
        String[][] student = {
                {"12345", "홍길동"},
                {"34563", "이혜인"},
                {"453321", "김명성"},
                {"56456", "경복대"},
                {"67853", "이대학"}
        };

        // 과목
        String[] subject = {"국어", "영어", "수학"};

        // 점수 저장 배열
        int[][] score = new int[student.length][subject.length];
        int[] sum = new int[student.length];

        // 점수 입력
        for (int i = 0; i < student.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s 학생의 %s 성적 입력 : ", student[i][1], subject[j]);
                score[i][j] = keyboard.nextInt();

                if (score[i][j] >= 0 && score[i][j] <= 100) {
                    j++;
                } else {
                    System.err.println("Error: 0~100 사이의 점수를 입력하세요.");
                }
            }
        }

        // 합계 계산
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                sum[i] += score[i][j];
            }
        }

        // 출력
        System.out.println("-------------------------------------");
        System.out.printf("학번   이름   %s  %s  %s  합계\n", subject[0], subject[1], subject[2]);
        System.out.println("-------------------------------------");

        for (int i = 0; i < student.length; i++) {
            System.out.printf("%6s %-4s %3d %3d %3d %4d\n",
                    student[i][0], student[i][1],
                    score[i][0], score[i][1], score[i][2], sum[i]);
        }
    }
}