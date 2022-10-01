import java.util.Scanner;

public class TemperatureSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = scanner.nextDouble();
        System.out.printf("%.2f", (9.0/5) * i + 32);
    }
}
