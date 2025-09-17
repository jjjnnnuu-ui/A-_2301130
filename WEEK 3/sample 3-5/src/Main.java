import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float litter= 0.0f;
        float km= 0.0f;
        float result= 0.0f;



        System.out.printf("사용 연료 량 입력: ");
        litter = keyboard.nextFloat();
        System.out.printf("운행거리 입력: ");
        litter = keyboard.nextFloat();



        result = km/litter;

        System.out.printf("사용 연료 량 :%.2f litter\n",litter);
        System.out.printf("운행 거리:%.2f km\n",km);
        System.out.printf("연비:%.2f km/litter\n",result);



    }
}