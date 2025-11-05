import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int count = 0;
        int total = 0;


        while (true) {
            System.out.print("양의 정수를 입력하세요: ");
            num = keyboard.nextInt();

            if (num > 0) {
                break;
            } else {
                System.err.println("Error: 양의 정수를 입력해야 합니다!");
            }
        }

        System.out.printf("입력한 정수는 %d입니다.\n", num);

        int temp = num;

        while (temp > 0) {
            int result = temp % 10;
            total += result;
            count++;
            temp /= 10;
        }
        System.out.printf("숫자의 개수는 %d개입니다.\n", count);
        System.out.printf("숫자의 합은 %d입니다.\n", total);



    }
}