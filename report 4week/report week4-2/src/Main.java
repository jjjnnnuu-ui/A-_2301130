import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //스캔받아야하는 재료인 Result값 받기

        int result;

        //금액 입력 받기
        System.out.print("판매금액 입력: ");
        result = keyboard.nextInt();
        //총 금액에서 tax값 을 뺀 값과 tax를 제외한 price 값을 받아야하기 떄문에 int로 두 변수 받기

        int tax = result/10;

        int price = result - tax;

        //받을 변수 다 받았으니 출력

        System.out.printf("금액:%d\n",price);

        System.out.printf("세금:%d \n",tax);


    }
}