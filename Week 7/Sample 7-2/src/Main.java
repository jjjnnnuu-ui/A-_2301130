import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.printf("정수 입력: ");
        num = keyboard.nextInt();
        result = (num %2 ==0)? "짝수" : "홀수";
        System.out.printf("입력한 정수 %d는 %s입니다 \n",num,result);



        if (num%2 ==0){
            result= "짝수";
        }
        else {
            result= "홀수";
        }
            System.out.printf("입력한 정수 %d는 %s입니다 \n",num,result);
        //swich case 는 if else 문이랑 상호적으로 사용 할 수 있음

        switch (num%2){
            case 1 : result = "홀수";
            break;

        case 0 : result = "짝수";
        break;
    }


    }
}