import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //변수를 입력받아야하기 때문에 scanner 사용
        Scanner keyboard = new Scanner(System.in);
        //기본적인 정보룰 입력 받아야하기 때문에  age card time 사용

        int age;
        char card = ' ';
        int time;
        //나이에 따라서,카드를 사용하는 여부에 따라서 금액이 다르기떄문에 변수 다 받아야함
        final int ADULT_CARD = 1250;
        final int ADULT_CASH = 1350;
        final int TEEN_CARD = 750;
        final int TEEN_CASH = 850;
        final int CHILD_FARE = 450;
        //심야할증에 대한 정보도 받아야하기 때문에 0.2 사용
        final double SURCHARGE_RATE = 0.20;

        // 기본적인 정보 스캔받기
        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();

        System.out.print("교통카드 사용여부를 입력하세요 (Y/N): ");
        card = keyboard.next().charAt(0);

        System.out.print("탑승 시간을 입력하세요 (0~23): ");
        time = keyboard.nextInt();


        //위 스캔받은 정보를 토대로 그에따른 여부를 판단해야하기 때문에 삼항연산자를 사용하여 판뵬함
        //나이 여부
        String ageresult = (age > 19) ? "성인입니다" :
                (age > 13) ? "청소년 입니다" :
                        "어린이 입니다";

        // 카드 사용 여부
        boolean isCard = (card == 'Y' || card == 'y');
        String cardresult = isCard ? "카드 사용자입니다" :
                "카드 사용자가 아닙니다";

        // 심야 시간 여부
        boolean NightTime = ((time >= 22) || (time < 5));
        String timeresult = NightTime ? "할증시간입니다" :
                "할증시간이 아닙니다";



        long baseFare = ageresult.equals("성인입니다") ?
                (isCard ? ADULT_CARD : ADULT_CASH) :
                ageresult.equals("청소년 입니다") ?
                        (isCard ? TEEN_CARD : TEEN_CASH) :
                        CHILD_FARE;

        double finalSurchargeRate = NightTime ? SURCHARGE_RATE : 0.0;
        double surchargeAmount = baseFare * finalSurchargeRate;

        double totalFare = baseFare + surchargeAmount;


      //결과 출력
        System.out.printf("나이: %s\n", ageresult);
        System.out.printf("카드 사용여부: %s\n", cardresult);
        System.out.printf("할증 여부: %s\n", timeresult);
        System.out.printf(" 기본 요금: %,d 원\n", baseFare);
        System.out.printf(" 할증 요금 (%.0f%%): %,.0f 원\n", finalSurchargeRate * 100, surchargeAmount);
        System.out.printf(" 최종 결제 금액: %.0f 원\n", totalFare);

    }
}
