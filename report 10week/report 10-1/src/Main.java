import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] ip = new int[5];   // 후보 번호 1~4까지 사용 (0번은 사용 안함)
        int nogood = 0;          // 무효표 수

        System.out.println("투표 시작"); //break를 받을 숫자가 없기 때문에 자바 프로그램의 특성을 이용하여
        //ctrl +D 를 입력받아 입력 종료 후 프로그램 종료

        // 입력이 끝날 때까지 반복
        while (keyboard.hasNextInt()) {
            int xdata = keyboard.nextInt();

            if (xdata >= 1 && xdata <= 4) {
                ip[xdata]++;   // 해당 후보 득표수 증가
            } else {
                nogood++;      // 무효표 증가
            }
        }

        // 결과 출력
        System.out.println("\n--- 투표 결과 ---");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + "번 후보 득표수: " + ip[i]); //1번 부터 4번까지의 투표를 받기 위하여 for 문 사용
        }
        System.out.println("무효표 수: " + nogood);

    }}


//어떤고등학교학급의반대표를뽑는데4명의후보가나왔다
//. 각각의 후보에게번호가1번부터4까지붙여졌을때, 투표
//자의수와각후보자의득표결과, 그리고무효표의수를출
//력하는Program을작성하시오.

//입후보자
//개인마다번호가주어지므로, 투표자들은각후보
//자의번호를사용하여투표한다고가정한다.
//(즉, 입력 데이터가입후보자의번호, 즉정수로들어온
//다고가정)
// 1~4번이외의입력이들어오면무효표로간주
//투표자의
//수를정확히알수없으므로더이상의입력이없을
//때까지투표후개표를진행
