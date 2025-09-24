//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a =5;
        int b =-a;
        int c= a++ +5+ --b;
        System.out.printf("a = %d,b=%d,c=%d\n",a,b,c);



         int d = ((a++) +6 - (++b));
         System.out.printf("a=%d,b=%d,d=%d=c=%d\n",a,b,c,d);

           float e= (float) a/c;
           System.out.printf("a=%d,b=%d,d=%d=c=%d,e=%.2f\n",a,b,c,d,e);

           int f =8%4;
        System.out.printf("a=%d,b=%d,d=%d=c=%d,e=%.2f\n",a,b,c,d,e);

        a+=+5*c;
        System.out.printf("a=%d,b=%d,d=%d=c=%d,e=%.2f\n",a,b,c,d,e);

    }
}