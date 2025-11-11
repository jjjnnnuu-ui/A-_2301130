//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int chicken, dog; //강아지와 닭 둘다 int 로 변수 받음

        for (chicken = 0; chicken <= 37; chicken++) {
            dog = 37 - chicken; //강아지의 마리수는 전체 마리수 37에서 닭의 마리수를 제외하면 됌
            if ((chicken * 2) + (dog * 4) == 102) {
                System.out.printf("닭: %d마리, 개: %d마리\n", chicken, dog);
                break;
            }
        }
    }
}

       // int chicken = 0;
       // int dog;

      //  while (chicken <= 37) {
          //  dog = 37 - chicken;
       //     if ((chicken * 2) + (dog * 4) == 102) {
     //           System.out.printf("닭: %d마리, 개: %d마리\n", chicken, dog);
       //         break;
    //        }
         //   chicken++;
   //     }
        //여기서부터 do문
   //     int chicken = 0;
     //   int dog;

       // do {
         //   dog = 37 - chicken;
           // if ((chicken * 2) + (dog * 4) == 102) {
           //     System.out.printf("닭: %d마리, 개: %d마리\n", chicken, dog);
             //   break;
            //}
          //  chicken++;
       // } while (chicken <= 37);

    //}
//}