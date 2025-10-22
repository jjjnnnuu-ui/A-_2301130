import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        double s, area;
        String result;

        System.out.print("삼각형의 세 변의 길이 입력: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 조건 수정: 세 변이 모두 양수이고, 삼각형 부등식을 만족해야 함
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format("삼각형의 넓이 : %.2f cm²", area);
        } else {
            result = "삼각형을 만들 수 없습니다.";
        }

        System.out.printf("세 변의 길이 %dcm, %dcm, %dcm이면, %s\n", a, b, c, result);

        keyboard.close();
    }
}