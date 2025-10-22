import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int height;
        char gender;
        double standard;
        double weight;
        String result, result1, result2;

        System.out.print("성별 (남=1, 여=2)? ");
        gender = keyboard.next().charAt(0);

        System.out.print("당신의 키 입력(cm): ");
        height = keyboard.nextInt();

        System.out.print("몸무게(kg)는? ");
        weight = keyboard.nextDouble();

        // 표준체중 계산
        if (gender == '1') {  // 남자
            standard = (height - 100) * 0.9;
        } else if (gender == '2') { // 여자
            standard = (height - 100) * 0.85;
        } else {
            System.out.println("성별 입력이 잘못되었습니다.");
            keyboard.close();
            return;
        }

        // 소수점 첫째 자리에서 올림
        standard = Math.ceil(standard * 10) / 10.0;

        // 차이 및 비율 계산
        double kilo = weight - standard;
        double percent = (kilo / standard) * 100.0;

        // 다이어트 필요 여부
        result2 = (weight > standard) ? "다이어트가 필요합니다." : "다이어트가 필요 없습니다.";

        // 체중 상태 판정
        if (percent <= -10.0) {
            result = "저체중";
        } else if (percent < 20.0) {
            result = "정상";
        } else if (percent <= 29.0) {
            result = "경도 비만";
        } else if (percent <= 49.0) {
            result = "중등도 비만";
        } else {
            result = "고도 비만";
        }

        // 초과 / 미달 판단
        result1 = (percent > 0.0) ? "초과" : "미달";

        // 출력
        System.out.printf("키가 %dCm인 %s의 표준체중은 %.1fKg 입니다.\n",
                height, (gender == '1' ? "남자" : "여자"), standard);
        System.out.printf("당신은 %s으로 표준체중보다 %.1f%% (%.1fKg) %s입니다.\n",
                result, Math.abs(percent), Math.abs(kilo), result1);
        System.out.println(result2);

        keyboard.close();
    }
}