import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int START ;
        final int LAST;

            System.out.printf("어디서 부터 더할까요? :");
            START = keyboard.nextInt();
            System.out.printf("어디까지 더할까요? :");
            LAST = keyboard.nextInt();



        int sum =0;
        for(int i =1; i<=100; i++){
            sum +=1;
        }
        System.out.printf("%d+%d+......%d+%d=%d",START,START+1,LAST-1,LAST,sum);



    }
}