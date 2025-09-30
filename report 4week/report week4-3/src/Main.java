import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //스캔받을 변수값 달러,하프,쿼터,다임,니켈,페니에게 int주기

        int Dollar ;
        int half ;
        int quarter ;
        int dime ;
        int nickel ;
        int penny ;

        //각 5개의 변수 개수 스캔받기

        System.out.print("달러의 개수: ");
        Dollar = keyboard.nextInt();
        System.out.print("하프의 개수: ");
        half = keyboard.nextInt();
        System.out.print("쿼터의 개수: ");
        quarter = keyboard.nextInt();
        System.out.print("다임의 개수: ");
        dime = keyboard.nextInt();
        System.out.print("니켈의 개수: ");
        nickel = keyboard.nextInt();
        System.out.print("페니의 개수: ");
        penny = keyboard.nextInt();

        //마지막 결론 도출을 위하여 각각변수에 맞는 금액을 곱해서 결론도출 준비

       int result = (Dollar*100)+(half*50)+(quarter*25)+(dime*10)+(nickel*5)+penny;

       //마지막 결론 도출 후 스캔받기

        System.out.printf("총 센트:%d ",result);



    }
}

