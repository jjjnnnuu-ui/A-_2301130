import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int score;
        char grade, plus;

        System.out.print("점수 입력: ");
        score = keyboard.nextInt();


        grade = 'F';
        plus = ' ';

        if (score >= 0 && score <= 100) {

            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }


            if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D') {
                switch (score % 10) {
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                        plus = '+';
                        break;
                    default:
                        plus = ' ';
                        break;
                }
            }

            System.out.printf("점수가 %d이면, 학점은 %c%c 입니다.\n", score, grade, plus);
        } else {
            System.out.println("점수 입력이 잘못되었습니다. (0~100 사이의 값만 입력)");
        }

        keyboard.close();
    }
}