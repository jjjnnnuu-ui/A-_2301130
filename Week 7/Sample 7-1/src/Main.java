import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;


        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        String result = (num2==0) ? "애러 분모가 0이면 안됩니다 " : "";



        if (num2 ==0){
            float temp = (float)num1/num2;

            System.err.println("애러 : 분모가 0이면 안됩니다");

        }
        else {
            System.out.printf("%d / %d = %.2f\n",num1,num2,result);

        }

    }
}