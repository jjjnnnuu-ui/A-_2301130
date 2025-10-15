//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

       final int korea = 99720;
        final int NORTHKOREA = 122762;
        final int USA=9631418;
        final int JAPAN = 377873;

        float temp1,temp2,temp3;

        temp1 = (float)NORTHKOREA/korea;
        temp2 = (float)USA/korea;
        temp3 = (float)JAPAN/korea;


        System.out.printf("대한민국의 면적 : %d \n",Korea);
        System.out.printf("북한의 면적 : %d \n",NORTHKOREA);
        System.out.printf("미국의 면적 : %d \n",USA);
        System.out.printf("일본의 면적 : %d \n",JAPAN);

        System.out.printf("북한의 대한민국의 %.1f 배 입니다\n",temp1);
        System.out.printf("미국은 대한민국의 %.1f 배 입니다\n",temp2);
        System.out.printf("일본은 대한민국의 %.1f 배 입니다\n",temp3);





    }
}