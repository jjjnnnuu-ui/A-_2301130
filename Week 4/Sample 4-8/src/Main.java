import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int salary,bonus;
        int total,tax;

        System.out.print("월급 입력 : ");
        salary = keyboard.nextInt();

        System.out.print("보너스 입력 : ");
        bonus = keyboard.nextInt();

        total = salary+bonus;

        tax = (int)(total*(8.0f/100));

        tax/=10;
        tax*=10;


        System.out.printf("본봉은 %d 원 \n",salary);
        System.out.printf("보너스는 %d 원 \n",bonus);
        System.out.printf("총 수입액 =  %d 원 \n",total);
        System.out.printf("세금 : %d 원 \n",tax);
        System.out.printf("실 입금액 = %d원\n",total-tax);


    }
}