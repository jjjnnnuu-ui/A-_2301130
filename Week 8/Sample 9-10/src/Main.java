//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int SAVE = 100000000;   // 초기 예금액 1억
        final int MONTH_WITHDRAW = 2000000; // 매달 인출 금액 2천만
        final float RATE = 5 / 100.0f;  // 연이자율 5%

        float deposit = SAVE;  // 현재 잔고
        int month = 0;         // 개월 수

        do {
            // 매달 돈을 200만원 출금
            deposit -= MONTH_WITHDRAW;
            month++;

            // 매달 잔고 출력
            System.out.printf("%d달 후 잔고: %,.0f원\n", month, deposit);

            // 잔고 0 이하일 시에 브레이크
            if (deposit <= 0) {
                break;
            }

            //이자 계산
            if (month % 12 == 0) {
                deposit += deposit * RATE;
                System.out.printf("%d개월 후 이자 지급 새로운 잔고: %,.0f원\n", month, deposit);
            }

        } while (true);

        System.out.printf("\n%d개월(%.1f년)까지 살 수 있습니다요.\n", month, month / 12.0);
    }
}
