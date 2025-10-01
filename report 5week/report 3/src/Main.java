//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        //토탈값인 54321에서 각각 시간과 분 초 를 구해야하기때문에 sechour,secmin을 각각 1시간인 3600초와60초로 설정해줌

        int total = 54321;
        final int sechour = 3600;
        final int secmin = 60;

        //전체 초에서 설정해둔 sehour을 나눠서 몫을 구함 이게 시간
        //전체 초에서 구한 시간*초를 곱하여 빼줌 (이게 남은 초) 남은 초에서 secmin(60)으로 나누면 min까지 구할 수 있음
        //sec는 남은 초이기 때문에 54321에서 아까 구했던 hour*3600+min*60을 하여 빼줌 ->남은 초 까지 완성
        int hour = total/sechour;
        int min = (total-(hour*sechour))/secmin;
        int sec =54321-((min*60)+(hour*3600));

        //그대로 시,분,초를 출력해서 결과 값을 냄

        System.out.printf("54321초 =%d 시간 %d 분 %d 초\n",hour,min,sec);

    }
}