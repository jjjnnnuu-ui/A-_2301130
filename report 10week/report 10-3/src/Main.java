import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int NUM_STUDENTS = 10; // 학생 수 10명

        // 10명 학생 정보를 저장
        String[] names = new String[NUM_STUDENTS]; // 이름
        int[] report = new int[NUM_STUDENTS]; // 과제 점수 40%
        int[] Finaltest = new int[NUM_STUDENTS]; // 중간고사 점수 15%
        int[] Midtest = new int[NUM_STUDENTS]; // 기말고사 점수 15%
        int[] schoollist = new int[NUM_STUDENTS]; // 출석 점수 20%
        int[] quiz = new int[NUM_STUDENTS]; // 퀴즈 점수 10%

        // 가중치
        final double W_MID = 0.15;
        final double W_FINAL = 0.15;
        final double W_QUIZ = 0.10;
        final double W_REPORT = 0.40;
        final double W_ATTENDANCE = 0.20;
        final int NUM_SCORES = 5;

        // 10명 학생의 점수 입력
        for (int i = 0; i < NUM_STUDENTS; i++) { // 인덱스는 0부터 9까지 (10번 반복)
            System.out.println("\n--- [" + (i + 1) + "번째 학생 정보 입력] ---");

            System.out.print("이름을 입력하세요: ");
            names[i] = keyboard.next();

            System.out.print("중간고사 점수(100점 만점): ");
            Finaltest[i] = keyboard.nextInt();

            System.out.print("기말고사 점수(100점 만점): ");
            Midtest[i] = keyboard.nextInt();

            System.out.print("퀴즈 점수(100점 만점): ");
            quiz[i] = keyboard.nextInt();

            System.out.print("과제/레포트 점수(100점 만점): ");
            report[i] = keyboard.nextInt();

            System.out.print("출석 점수(100점 만점): ");
            schoollist[i] = keyboard.nextInt();
        }

        System.out.println("| 순번 | 이름   | 중간(15%) | 기말(15%) | 퀴즈(10%) | 과제(40%) | 출석(20%) | 단순 평균 | 가중치 평균 |");

        //점수 계산 및 결과 출력
        for (int i = 0; i < NUM_STUDENTS; i++) {
            //평균 계산
            int totalSum = Finaltest[i] + Midtest[i] + quiz[i] + report[i] + schoollist[i];
            double simpleAverage = (double) totalSum / NUM_SCORES;

            //평균 계산
            double weightedAverage = (Finaltest[i] * W_MID) +
                    (Midtest[i] * W_FINAL) +
                    (quiz[i] * W_QUIZ) +
                    (report[i] * W_REPORT) +
                    (schoollist[i] * W_ATTENDANCE);

            //결과 출력
            System.out.printf("| %-4d | %-4s | %-9d | %-9d | %-9d | %-9d | %-9d | %-9.2f | %-11.2f |\n",
                    (i + 1), names[i], Finaltest[i], Midtest[i], quiz[i], report[i], schoollist[i],
                    simpleAverage, weightedAverage);
        }

    }
}

// JAVA 성적의중간, 기말, 퀴즈, 과제, 출석점수가모두100
//점만점으로작성되어있다. 각부문별점수를입력받아서
//단순평균점수와가중치평균점수를구하는Program을작
//성하여라.
//각점수의반영비율은각각중간15%, 기말15%, 퀴즈
//10%, 과제40%, 출석 20%이다
//가중치
//점수는각점수에가중치를곱하여더한값이다