import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int salary;
        int tax = 0;

        System.out.print("급여액 입력(1~30000000): ");
        salary = keyboard.nextInt();

        if (salary > 0 && salary <= 30000000) {
            if (salary < 2000000) {
                tax = 0;
            } else if (salary <= 4000000) {
                tax = (int) ((salary - 2000000) * 0.05f); // 5%
            } else if (salary <= 6000000) {
                tax = (int) ((salary - 4000000) * 0.08f + 2000000 * 0.05f); // 누진 적용
            } else if (salary <= 20000000) {
                tax = (int) ((salary - 6000000) * 0.1f + 2000000 * 0.05f + 2000000 * 0.08f);
            } else { // 2천만 초과
                tax = (int) ((salary - 20000000) * 0.15f + 2000000 * 0.05f + 2000000 * 0.08f + 14000000 * 0.1f);
            }

            System.out.printf("급여액 %,d원이면 세금은 약 %,d원입니다.\n", salary, tax);
        } else {
            System.err.println("급여액에 이상이 있습니다.");
        }

        keyboard.close();
    }
}