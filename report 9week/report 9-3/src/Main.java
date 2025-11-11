//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int holl = 300;   // 우물 깊이
        int up = 55;      // 올라가는 길이
        int down = 13;    // 미끄러지는 길이
        int height = 0;   // 바닦시작
        int day;          // 일수

        for (day = 1; day <= 7; day++) {

            // 낮 동안 올라감
            height += up;
            System.out.printf("%d일 낮: %dcm 도달\n", day, height);

            // 낮에 우물 탈출 여부 확인
            if (height >= holl) {
                System.out.printf("탈출했습니다!\n", day);
                break;
            }

        }

        // 7일이 지나도 탈출 못한 경우
        if (height < holl) {
            System.out.println("실패하였습니다 .");
        }
    }
}


//방울꽃이
//사랑하는나비는방울꽃의달콤한향기만을좇아
//날아들었고방울꽃의꽃잎이지자금방날아가버렸지요. 하
//지만달팽이는자신의등껍질이햇빛에마르도록방울꽃의
//곁을지켰다는사랑이야기입니다.
//이달팽이가이번에는3m 깊이의우물에빠지게되었습니다.
//하루이틀꽃잎이지는방울꽃은일주일이면꽃잎이모두떨
//어져시들어버리게됩니다. 달팽이가낮동안에열심히우물
//을기어올라가면55cm를올라가고쉬는밤중에는13cm를
//미끄러지게됩니다. 과연이달팽이는방울꽃이시들기전에


//그곁을지킬수있을까요?
//문제분석
//3m 깊이의우물에빠진달팽이가낮동안에55cm를올
//라가고밤에는13cm를미끄러지게된다.
//이달팽이는일주일안에우물을탈출할수있을까?