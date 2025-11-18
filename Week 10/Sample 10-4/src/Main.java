import java.util.Random;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int SIZE = 6;
        int[] lotto = new int[SIZE];
        boolean flag;

        int i = 0;
        while (i < lotto.length) {
            flag = false; // 중복 여부 초기화
            lotto[i] = random.nextInt(45) + 1;

            // 중복 체크
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                i++; // 중복이 없을 때만 다음 칸으로 이동
            }
        }

        // 출력
        System.out.print("Lotto 번호: ");
        for (i = 0; i < lotto.length; i++) {
            System.out.printf("%2d ", lotto[i]);
        }
        System.out.println(); // 줄바꿈
    }
}