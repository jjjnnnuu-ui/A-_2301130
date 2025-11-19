//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String[] prductus = {"TV","냉장고"};

        int [][][] sales = new int[prductus.length][][];   // ← 세미콜론 없음 → 추가함

        sales[0] = new int[][] {
                {2018,9,7,4,3,2},
                {2019,5,6,7,8,7},
                {2020,13,21,7,8,9}
        };

        sales[1] = new int[][] {
                {2018,8,9,6,7,8},
                {2019,5,6,7,8,7},
                {2020,13,21,7,8,9}
        };
        System.out.printf("*************************************************");

        for (int i = 0; i < prductus.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {

                System.out.printf("%4s %4d년 %4d %4d %4d %4d %4d\n",
                        prductus[i],
                        sales[i][j][0],
                        sales[i][j][1],
                        sales[i][j][2],
                        sales[i][j][3],
                        sales[i][j][4],
                        sales[i][j][5]
                );
                System.out.printf("*************************************************");

            }
        }
    }
}