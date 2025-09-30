import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //평수의 가격 변수값 받기(받는 숫자 전부 정수이기 때문에 int 로 받아도 무관하다 판단
        int sizeprice = 56000;
        //평수를 입력받아야하니 변수값 지정
        int area;

        //평수 스캔 받기
        System.out.print("평수 입력: ");
        area = keyboard.nextInt();

        //평수의 가격을 받아야하기 때문에 result로 정리해서 출력 준비


        int result = area*sizeprice;
        //천원미만단위 버리는 코드
        result = (result/1000)*1000;

        //결론 도출
        System.out.printf("평수의 가격은 %d원 입니다\n",result);



    }
}