import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int hundred = i / 100;
        int tens = i /10 %10;
        int unit = i % 10;

        int sum = hundred * hundred * hundred + tens * tens * tens + unit * unit * unit;
        System.out.printf("result:%d",sum);
    }
}
