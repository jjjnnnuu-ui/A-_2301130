//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int Obeak = 500; //500원
        int beakwon = 100; //100원
        int day = 365 ; //1년 365일
        int oneyears; //1년 설정
        int result; //총 저축금액 설정

        oneyears=day*((Obeak*10)+(beakwon*10));  //1년동안 저축하는 금액 설정
        result = 30*oneyears; //총 저축금액 계산

        System.out.printf("30년동안 처축한 금액은 :%d원 입니다",result); //30년동안 저축한 금액 프린트



    }
}




//한달에 500원짜리동전, 100원짜리동전각각10개를돼지
//저금통에저금하기로하였다.
// 30년동안저금을한다면총 저금액이 얼마가될지계산하
//는프로그램을작성하시오

//한달에500원짜리동전10개와100원짜리동전10개씩
//을저금한다면
//한달저금액(month) =  (500 ×10 + 100 ×10)원
//1년은12달이고30년동안저금한다고하였으므로
//총저금액(amount) = 한달저금액(month) × 12 × 30