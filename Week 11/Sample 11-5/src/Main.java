import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[][] employees = {
                {"홍길동", "1111"}, {"강인성", "1411"}, {"아이들", "1167"},
                {"이동형", "1677"}, {"이동훈", "1555"}, {"전성실", "1777"},
                {"고길동", "1441"}, {"서준동", "1737"}, {"박문대", "1772"},
                {"오민재", "3333"}
        };

        char[] hobong = new char[] { '1', '2', '3', '5', '4', '3', '3', '1', '4', '2' };
        int[][] salarys = new int[employees.length][5];



        int[] basePay = {1500000, 1800000, 2100000, 2500000, 2800000};



        int[] allowance = {200000, 250000, 300000, 350000, 400000};


        for (int i = 0; i < employees.length; i++) {

            int h = hobong[i] - '1';

            salarys[i][0] = basePay[h];
            salarys[i][1] = allowance[h];
            salarys[i][2] = salarys[i][0] + salarys[i][1];
            salarys[i][3] = (int)(salarys[i][2] * 0.033);
            salarys[i][4] = salarys[i][2] - salarys[i][3];
        }


        System.out.println("************************************************************");
        System.out.println(" 사번    이름    호봉    기본급      수당        급여액      세금      지급액");
        System.out.println("************************************************************");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%5s  %4s    %c   %,9d  %,9d  %,9d  %,9d  %,9d\n",
                    employees[i][1], employees[i][0], hobong[i],
                    salarys[i][0], salarys[i][1], salarys[i][2], salarys[i][3], salarys[i][4]);
        }
    }
}
//지피티로 수정 한번 거침