import java.util.Scanner;

public class Globe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v = scanner.nextDouble();

        System.out.printf("%.3f",(4.0 / 3) * Math.PI * Math.pow(v,3));
    }
}
