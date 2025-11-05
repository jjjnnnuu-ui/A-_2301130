//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        int day;
        long pay = 0L;
        long temp = 0L;

        for (day = 1; true; day++) {
            temp = (day == 1) ? 1 : temp * 2;
            pay += temp;
            System.out.printf("오늘 저축 금액 = %,10d 원,  %3d 일 = %,11d 원\n",
                    temp, day, pay);
            if (pay > 100000000L)
                break;
        }
        System.out.printf(" 1억원 %d일 만에 달성 \n", day);
    }
}


//수업시간에 만들었던 모듈이 실수로 지워져버려서 비슷한 내용이였던 1억 만들기 셈플로 대체하였습니다.