import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 필요하니까 스캐너 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("구매할 식권의 개수를 입력하세요: ");
        //식권 개수 입력받기
        int couponCount = scanner.nextInt();

        int discount =
                // 30장 이상일경우 20% 할인        (? 참일 때 값 : 거짓일 때 값) 사용
                (couponCount >= 30) ? 20 :
                        // 20장 이상 15%
                        (couponCount >= 20) ? 15 :
                                // 10장 이상 10%
                                (couponCount >= 10) ? 10 :
                                        // 그 외 (10장 미만) 0%
                                        0;
        // 결과 출력
        //스캐받은 쿠폰의 개수 출력받기
        System.out.printf("구매 개수: %d장\n", couponCount);

       //결과값 출력
        System.out.printf("적용되는 할인율: %d% \n", discount);

    }
}



