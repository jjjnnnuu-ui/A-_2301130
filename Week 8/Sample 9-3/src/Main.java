import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int count = 10;   // 학생 수
        int total = 0;
        float avg;
        int grade;

        // 학생 성적 10명 입력 받기
        for (int i = 1; i <= count; i++) {
            System.out.printf("%d번 학생 성적 입력: ", i);
            grade = keyboard.nextInt();

            if (grade >= 0 && grade <= 100) {
                total += grade;
            } else {
                System.err.println("ERROR: 성적은 0~100 사이로 입력하세요!");

            }
        }

        avg = total / (float) count;
        System.out.printf("총점: %,d점\n", total);
        System.out.printf("평균: %.2f점\n", avg);

    }
}