import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keboard = new Scanner(System.in);

        int salary,expense;
        float saveRate;
        int save,remain,money;



        System.out.println("월급을 입력하세요: ");
        salary = keboard.nextInt();
        System.out.println("저축비울 입력하세요: ");
        saveRate = keboard.nextFloat();
        System.out.println("월 지출 총액을 입력하세요 : ");
        expense = keboard.nextInt();

        save = (int)(salary * saveRate);
        remain = salary - (save + expense);
        money = remain /30;




        System.out.println("예산 계산 결과\n");
        System.out.printf("월급 : %d원 \n",salary);
        System.out.printf("저축액 : %d원 \n",save);
        System.out.printf("지출액 : %d원 \n",expense);
        System.out.printf("남은 금액 : %d원 \n",remain);
        System.out.printf("일일 사용 가능 예산 : %d원 \n",money);


    }
}