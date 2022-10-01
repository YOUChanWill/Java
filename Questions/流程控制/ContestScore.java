import java.util.Scanner;

public class ContestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int min = 1000;
        int max = 0;
        int sum = 0;
        for (int j = 0; j < i; j++) {
            int score = scanner.nextInt();
            if (score >= max){
                max = score;
            }
            if ((score < min) ) {
                min = score;
            }
            sum += score;
        }
        System.out.print((sum - min - max) / (i - 2));


    }
}
