import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = scanner.nextInt();
        boolean f;

        if (i == 2){
            System.out.print((int) i + " ");
        } else {
            for (double j = 2; j < i; j++) {
                f = true;
                for (double k = 2; k <= Math.sqrt(j) ; k++) {
                    if (j % k == 0){
                        f = false;
                        break;
                    }
                }
                if (f){
                    System.out.print((int)j + " ");
                }
            }

        }


    }
}
