import java.util.Scanner;

public class BuyPen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int amount = i / 5;

        int amount1 = amount / 20 * 5;

        int amount2 = amount % 20 / 5;

        System.out.println(amount + amount1 + amount2);

    }
}
