import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);



     int won;
    float dollar;
    float convert;
    float dollar;



      System.out.printf("오늘의 달러 환율 입력:");
      convert = keyboard.nextFloat();
      System.out.printf("얼마를 달러로 환전할까요?");
      won = keyboard.nextInt();
      dollar = won/convert;




        System.out.printf("원화 %d원은 %f달러($) 입니다.",won, dollar);

    }
}