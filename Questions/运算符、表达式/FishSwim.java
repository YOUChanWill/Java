import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FishSwim {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.next();
        String date1 = scanner.next();

        String[] dates = date.split(":");
        String[] dates1 = date1.split(":");

        Integer h = Integer.valueOf(dates[0]);
        Integer h1 = Integer.valueOf(dates1[0]);

        Integer m = Integer.valueOf(dates[1]);
        Integer m1 = Integer.valueOf(dates1[1]);

        int h2 = h1 - h;
        int m2 = m1 - m;

        if ((m1 - m) < 0){
            h2 = h1 - h - 1;
            m2 = 60 - m + m1;
        }

        System.out.println(h2+"h"+m2+"m");

//        Date d1 = new SimpleDateFormat("HH:mm").parse(date);
//        Date d2 = new SimpleDateFormat("HH:mm").parse(date1);
//
//        long a = d2.getTime() - d1.getTime();
//        String hh = new SimpleDateFormat("HH").format(new Date(a));
//        String mm = new SimpleDateFormat("mm").format(new Date(a));
//
//        System.out.println(hh + "h" + mm + "m");


    }
}
