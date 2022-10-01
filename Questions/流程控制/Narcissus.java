public class Narcissus {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            int gewei = i % 10;
            int shiwei = i / 10 % 10;
            int baiwei = i / 100;

            int cube = gewei*gewei*gewei + baiwei*baiwei*baiwei + shiwei*shiwei*shiwei;
            if (i == cube){
                System.out.print(i + " ");
            }
        }

    }
}
