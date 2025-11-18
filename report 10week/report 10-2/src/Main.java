import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int [] score = new int[10]; //점수 10개 입력받기
        double avg; // 입력받은 성적의 평균값
        int MAX; // 입력받은 성적의 최댓값
        int MIN; //입력받은 성적의 최소값
        int sum = 0; //입력받은 성적의 합계


        System.out.println("학생의 JAVA점수를 입력하세요 : ");

        for (int i = 0; i < score.length; i++) {

            int inputScore = keyboard.nextInt(); // 입력값 변수에 저장

            if (inputScore < 0 || inputScore > 100) {
                System.err.println("Error : 점수는 0~100 사이로 입력해야 합니다. 다시 입력해주세요."); //에러문 프린트
                i--; //오류 발생시에 한쵯수 전으로 돌아가서 다시 실행함
                continue;
            }

            score[i] = inputScore;
            sum += score[i]; //입력받은 값 더하기


        }

     //MAX 와 MIN 값 초기화 받기
        MAX = score[0];
        MIN = score[0];

       //최댓값과 최솟값 계산하기 위하여 for 문 사용함
        for (int i = 1; i < score.length; i++) {
            // 최댓값
            if (score[i] > MAX) {
                MAX = score[i];
            }
            // 최솟값
            if (score[i] < MIN) {
                MIN = score[i];
            }
        }

        avg = (double) sum / score.length;
        //문제에서 제시한거 프린트


        System.out.println("총 합계: " + sum);
        System.out.printf("평균: %.2f\n", avg);
        System.out.println("최댓값: " + MAX);
        System.out.println("최솟값: " + MIN);


    }
}

//Keyboard
//로부터학생10명의JAVA 성적을입력받아합계
//와평균, 최대값, 최소값을구하는Program을단순변수와
//배열을사용하는경우로나누어작성해보자.