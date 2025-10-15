import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int CIGA = 7;

        int life;
        int ga;


        System.out.print("당신은 몇 년 동안 담배를 피웠나요? : ");
        life = keyboard.nextInt();

        System.out.print("하루에 평균 담배를 몇 개피 피웠나요? : ");
        ga = keyboard.nextInt();


        int totalCigarettes = life * 365 * ga;
        int minute = totalCigarettes * CIGA;


        int year = minute / (60 * 24 * 365);
        int day = (minute / (60 * 24)) % 365;
        int hour = (minute / 60) % 24;
        int min = minute % 60;


        System.out.printf("담배 1개피는 %d분의 생명을 단축합니다.%n", CIGA);
        System.out.printf("%d년 동안 하루에 %d개피의 담배를 피우면 총 %d개피를 피운 셈입니다.%n", life, ga, totalCigarettes);
        System.out.printf("총 %.0f시간, 즉 %d년 %d일 %d시간 %d분의 생명이 단축됩니다.%n",
                (float)minute / 60, year, day, hour, min);
    }
}
