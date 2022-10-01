import java.util.Scanner;

public class ElephantWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("请输入高度:");
        int h = scanner.nextInt();
//        System.out.println("请输入底面积:");
        int s = scanner.nextInt();

        int v = h * s;

        int pails = (int)Math.ceil(20000.0/v);
        System.out.printf("%d pails\n",pails);

    }
}
