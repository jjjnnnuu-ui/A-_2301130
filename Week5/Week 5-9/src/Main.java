import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float hight;
        char gender;
        float weight;
        float weight1;
        String result;

        System.out.println("당신의 성별은(남 == M, 여 == F)");
        gender = keyboard.next().charAt(0);
        System.out.println("당신의 키(단위:Meter)입력 :");
        hight= keyboard.nextFloat();

        weight = gender == 'M' || gender == 'm' ? hight*hight*22:hight*hight*21;

        weight1 = hight*hight*20;
        result = gender =='F' || gender =='f' ?

                String.format("키가 %.2f Meter인 여자의 표준체중은 %.2f kg 입니다 \n",hight,weight1);

        String.format("");




        System.out.printf("키가 %.2f Meter인 %c자의 표준체중은 %.2f kg 입니다 \n",hight,gender,weight);

        System.out.printf(result);


    }
}