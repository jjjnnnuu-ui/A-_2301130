import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        float weight;
        float feet,pound;

        final float FEETUINT =0.0328884f;
        final  float POUNDINT = 2.20462f;

       System.out.print("당신의 키 입력 (174.3 cm) :");
       height = keyboard.nextFloat();

        System.out.print("당신의 몸무게 입력 (80kg) :");
        weight = keyboard.nextFloat();


        feet = height*FEETUINT;
        pound = weight*POUNDINT;


        System.out.printf("당신의 키는 %.2f cm는 %.2f 피트 입니다. \n",height, feet);
        System.out.printf("당신의 몸무게는  %.2f kg는  %.3f.파운드 입니다. \n",weight,pound);



    }
}