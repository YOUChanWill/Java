import java.util.Scanner;

public class Statistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int z = 0;
        int f = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            if (m < 0){
                f++;
            } else if (m == 0) {
                zero++;
            } else if (m > 0) {
                z++;
            }
        }
        System.out.println(z+" "+f+" "+zero);

    }
}
