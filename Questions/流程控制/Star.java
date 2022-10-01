import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "*";
        int i = 0;

        while (scanner.hasNextInt()) {
            i = scanner.nextInt();
            if (i % 2 == 1) break;
        }

        for (int hangshu = 1; hangshu <= i/2; hangshu++) {

            for (int space = 0; space < i/2 + 1 - hangshu; space++) {
                System.out.print(" ");
            }
            for (int number = 1; number <= hangshu*2 - 1; number++) {
                System.out.print(str);
            }
            System.out.println();
        }

        for (int mid = 0; mid <= i; mid++) {
            System.out.print(str);
        }
        System.out.println();

        for (int hangshu1 = i/2; hangshu1 >= 1; hangshu1--) {

            for (int space1 = i/2 + 1 - hangshu1; space1 > 0; space1--) {
                System.out.print(" ");
            }
            for (int number1 = hangshu1*2 - 1; number1 >= 1; number1--) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}



