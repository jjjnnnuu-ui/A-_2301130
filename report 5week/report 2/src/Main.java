import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캔받기위한 스캐너 준비

        Scanner keyboard = new Scanner(System.in);
        //스코어값과 마지막 출력값을 받기위한 준비물
        int score;
        String grade;
        //스캔받기
        System.out.print("Java 점수를 입력하세요 : ");

        score = keyboard.nextInt();

        //점수 범위별 등급 지정 후 마지막 F까지 추가
        grade = score >= 96 && score <= 100 ? "A+" : // 96 ~ 100
                score >= 90 && score <= 95 ? "A0" :  // 90 ~ 95
                        score >= 86 && score <= 89 ? "B+" :  // 86 ~ 89
                                score >= 80 && score <= 85 ? "B0" :  // 80 ~ 85
                                        score >= 76 && score <= 79 ? "C+" :  // 76 ~ 79
                                                score >= 70 && score <= 75 ? "C0" :  // 70 ~ 75
                                                        score >= 66 && score <= 69 ? "D+" :  // 66 ~ 69
                                                                score >= 60 && score <= 65 ? "D0" :  // 60 ~ 65
                                                                        "F";
        //입력받은 점수와 그에 맞는 출력값의 등급 출력

        System.out.printf("입력 점수: %d\n", score);
        System.out.printf("등급: %s\n", grade);
    }
}