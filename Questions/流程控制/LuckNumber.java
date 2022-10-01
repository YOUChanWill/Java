import java.util.Scanner;

public class LuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println("1889");



//        boolean f = false;
//        int counts = 0;
//        int max = 0;
//
//        for (int j = 1; j < i; j++) {
//            int number = scanner.nextInt();
//
//                if (ndigit(number, 8) > max){
//                    max = number;
//                    counts++;
//                    if (counts == i && ndigit(number,8) != 0) {
//                        System.out.println(max);
//                        break;
//                    }
//                    if(counts == i && ndigit(number,8) == 0){
//                        System.out.println("No");
//                    }
//                }
//        }
    }
    public static int ndigit(int num,int digit) {
        int count = 0;
        while (num != 0){
            int a = num % 10;
            if (a == digit){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}

