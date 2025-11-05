import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int kor, eng, math;
        int total;
        float avg;
        String check;

        while (true) {
            System.out.print("당신의 이름은? (종료하려면 'exit' 입력) ➜ ");
            name = keyboard.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("당신의 국어 점수는? ➜ ");
            kor = keyboard.nextInt();

            System.out.print("당신의 영어 점수는? ➜ ");
            eng = keyboard.nextInt();

            System.out.print("당신의 수학 점수는? ➜ ");
            math = keyboard.nextInt();


            total = kor + eng + math;
            avg = total / 3.0f;

            if (avg >= 70) {
                check = "합격";
            } else {
                check = "불합격";
            }

            System.out.println();
            System.out.printf(">>> %s 님의 성적표 <<<\n", name);
            System.out.printf("국어: %d점\n", kor);
            System.out.printf("영어: %d점\n", eng);
            System.out.printf("수학: %d점\n", math);
            System.out.printf("총점: %d점\n", total);
            System.out.printf("평균: %.2f점\n", avg);
            System.out.printf("판정: %s\n", check);
            System.out.println("-------------------------------\n");
        }



    }
}