import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2;
        int result;
        System.out.printf("정수를 두개 입력하세요 : ");
        num1 =keyboard.nextInt();
        num2 =keyboard.nextInt();


        result = num1 > num2 ? num1:num2;


        System.out.printf("입력한 %d 와 %d중 큰 수는 %d 입니다.\n",num1,num2,result);

    }
}