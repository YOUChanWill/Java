import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        for (int j = 0; j < 10; j++) {
            int m = scanner.nextInt();
            if (m < 60){
                count++;
            }
            sum += m;
        }
        System.out.println(sum/10 + " " + count);


    }
}
