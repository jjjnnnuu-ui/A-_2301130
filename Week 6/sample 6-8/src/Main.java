public class Main {
    public static void main(String[] args) {
        final int RADIUS = 6_378_137;
        final int KOREA = 99_720;

        final double PI = Math.PI;


        double surfaceKm2 = 4.0 * PI * RADIUS * RADIUS / 1_000_000.0;


        double resultPercent = (double) KOREA / surfaceKm2 * 100.0;


        System.out.printf("지구의 반지름은 %.3f km 입니다.%n", RADIUS / 1000.0);
        System.out.printf("지구의 표면적은 %.0f km² 입니다.%n", surfaceKm2);
        System.out.printf("대한민국의 면적은 %d km² 입니다.%n", KOREA);
        System.out.printf("대한민국은 지구의 %.8f%% 입니다.%n", resultPercent);
    }
}
