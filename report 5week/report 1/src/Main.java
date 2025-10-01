import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);


        int ch;
        String result;

        System.out.print("문자 입력 : ");
        ch=keyboard.nextInt();


        result = (ch >= 'A' && ch <= 'Z') ? ("입력한 문자 " + ch + " → " + (char)(ch + 32)) :
                (ch >= 'a' && ch <= 'z') ? ("입력한 문자 " + ch + " → " + (char)(ch - 32)) :
                        "영문자가 아닙니다.";


        System.out.println(result);
    }
}
