import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 학생 정보
        String[] hackbun = {"2501002", "2501004", "2501012", "2501022", "2501032", "2501042", "2501052", "2501062", "2501072", "2501082"};
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈", "강민성", "김시온", "이진우", "현장우", "니키타"};

        // 점수 관련 배열
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] sum = new int[name.length];
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];

        // 점수 입력
        for (int i = 0; i < name.length; i++) {
            System.out.printf("[%s(%s)] 학생의 성적 입력\n", name[i], hackbun[i]);

            // 국어 점수 입력
            while (true) {
                System.out.print("국어 점수: ");
                kor[i] = keyboard.nextInt();
                if (kor[i] >= 0 && kor[i] <= 100) break;
                System.err.println("0~100 사이의 점수를 입력하세요!");
            }

            // 영어 점수 입력
            while (true) {
                System.out.print("영어 점수: ");
                eng[i] = keyboard.nextInt();
                if (eng[i] >= 0 && eng[i] <= 100) break;
                System.err.println("0~100 사이의 점수를 입력하세요!");
            }

            // 수학 점수 입력
            while (true) {
                System.out.print("수학 점수: ");
                math[i] = keyboard.nextInt();
                if (math[i] >= 0 && math[i] <= 100) break;
                System.err.println("0~100 사이의 점수를 입력하세요!");
            }

            // 총점 / 평균 계산
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3.0f;
        }

        // 석차 계산
        for (int i = 0; i < name.length; i++) {
            rank[i] = 1; // 기본 1등
            for (int j = 0; j < name.length; j++) {
                if (sum[j] > sum[i]) rank[i]++;
            }
        }

        // 결과 출력

        System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t석차");

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
                    hackbun[i], name[i], kor[i], eng[i], math[i], sum[i], avg[i], rank[i]);
        }

    }
}