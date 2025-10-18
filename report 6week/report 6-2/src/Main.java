import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //리터당 평균값인1680원을 기준으로 잡음
        int price = 1680;
        //스캔받을 리터
        int Liter;
        //후 계산때 필요한 tax값 10퍼센트를 0.1로 잡기
        double tax = 0.1;
        //스캔받기
        System.out.print("주유할 리터를 입력해 주세요: ");
        Liter = keyboard.nextInt();
        //result 값을 일반 doble 로 받아봤는데 오류나서 long 으로 대체함
        long result = (long)Liter * price;
        //입력받은 값이 5만원 이상이면 할인률을 적용하기 위해 삼항연산자 사용
        double discount = (result >= 50000) ? 0.07 : 0.0;
        //할인값을 빼야하니 할인값 정수로 받기
        double discountAmount = result * discount;
        //전체 값에서 할인값 뺴기
        double all = result - discountAmount;
        //할인후에 세금값 빼야하기 때문에 마지막 연산
        double finish = all * (1 + tax); // 할인 후 금액에 (1 + 부가세율)을 곱함

        double alldiscount = discount * 100;

        long finalPriceRounded = Math.round(finish);
        //프린트 출력
        System.out.printf("주유량: %d L\n", Liter);
        System.out.printf("리터당 가격: %,d 원\n", price);

        System.out.printf("적용 할인율은 %.0f%% 입니다.\n", alldiscount);

        System.out.printf(" 최종 결제 금액은 %d 원 입니다.\n", finalPriceRounded);



    }
}
