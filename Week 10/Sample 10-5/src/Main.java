import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] ip = new int[5];   // 후보 1~4
        int nogood = 0;          // 무효표

        System.out.println("투표 시작 (입력 종료: Ctrl + D)");

        // 입력이 끝날 때까지 계속 반복
        while (keyboard.hasNextInt()) {
            int x = keyboard.nextInt();

            if (x >= 1 && x <= 4) {
                ip[x]++;          // 해당 후보 득표 증가
            } else {
                nogood++;         // 무효표 증가
            }
        }

        System.out.println("\n--- 개표 결과 ---");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + "번 후보 득표수: " + ip[i]);
        }
        System.out.println("무효표 수: " + nogood);

        keyboard.close();
    }
}