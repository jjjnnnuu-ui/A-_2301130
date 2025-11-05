//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final double TURTLE_SPEED = 35 * 1000.0 / 3600;
        final double RABBIT_SPEED = 60 * 1000.0 / 3600;

        double turtle = 450;
        double rabbit = 0;

        int i = 1;

        while (true) {
            turtle += TURTLE_SPEED;
            rabbit += RABBIT_SPEED;

            System.out.printf("%d초 후 → 거북이: %.2f m, 토끼: %.2f m\n", i, turtle, rabbit);

            if (rabbit > turtle) {
                System.out.printf("\n%d초 후에 토끼가 거북이를 추월했습니다!\n", i);
                break;
            }
            i++;
        }
    }
}