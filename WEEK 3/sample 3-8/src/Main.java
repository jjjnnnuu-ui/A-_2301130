import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        float avg = 0.0f;

        System.out.printf("국어 성적 입력:");
        kor = keyboard.nextInt();
        System.out.printf("영어 성적 입력:");
        eng = keyboard.nextInt();
        System.out.printf("수학 성적 입력:");
        math = keyboard.nextInt();


        total = kor + eng + math;
        avg = total / 3.0f;


        System.out.printf("국어 점수: %d\n",kor);
        System.out.printf("영어 점수: %d\n",eng);
        System.out.printf("수학 점수: %d\n",math);
        System.out.printf("총점 : %d",total);
        System.out.printf("평균 : %.2f",avg);










    }
}