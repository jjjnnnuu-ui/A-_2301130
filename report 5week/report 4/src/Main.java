import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //구매한 금액과 맴버쉽 회원인지를 확인하는 준비물 price 와 membership 준비
        int price;

        char membership;
        //스캔 받기

        System.out.print("총 구매 금액을 입력하세요 : ");
        price = keyboard.nextInt();

        System.out.print("멤버십 회원입니까? (Y/N 또는 y/n) : ");

        membership = keyboard.next().charAt(0);

        //구매액 50000원은 novip로 설정 구매액 30000원은 vip로 설정

        final int novip = 50000;
        final int vip = 30000;

        //멤버인지 멤버가 아닌지 판별
        boolean Member = (membership == 'Y' || membership == 'y');
        boolean noMember = (membership == 'N' || membership == 'n');

        // 맴버일 시 3만원 이상 맴버가 아닐시에는 5만원 이상
        boolean deliveryfee =
                (price >= novip) ||
                        (Member && price >= vip);

        String delivery = deliveryfee ?
                "무료 배송 대상입니다." :  //조건 충족시에 무료배송
                "배송비가 부과됩니다.";   // :를 사용하여 조건 충족 못할 시에 배송비 부과


        // 마지막 출력
        System.out.printf("총 구매 금액: %,d원\n", price);
        System.out.printf("멤버십 여부: %s\n", Member);
        System.out.println("무료 배송 가능 여부: "+ deliveryfee);
        System.out.println("배송 상태: " + delivery);


    }
}