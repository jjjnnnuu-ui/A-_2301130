//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int []java = {95,70,80,75,100};
        float[] java1 = {95.0f,70.0f,80.0f,75.0f,100.0f};
        String name[] = {"홍길동,이재명,윤석열,경복대"};

        for (int i = 0; i < java.length; i++) {
            System.out.printf("%d반 JAVA 성적 : %3d 점\n",i+1,java[i]);

        }

    }
}