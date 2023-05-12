package Problem;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class NumberConversion {
    public static void main(String[] args) {
        // Practice of ...
        // int decimal = 15;
        // String binary = Integer.toHexString(decimal);
        // System.out.println(binary);

        String binary = "1010";
        Integer decimal = Integer.parseInt(binary,2);
        System.out.println(decimal);

        Date date = new Date();
        System.out.println(date);
        DateFormat  dateFormat = new SimpleDateFormat("Y-M-D");
        String current = dateFormat.format(date);
        System.out.println(current);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter ss = DateTimeFormatter.ofPattern("hh.mm.ss");
        System.out.println("time Formate is:"+time.format(ss));

        //Random number ....
        Random rand = new Random();
        int rand_num = rand.nextInt(5)+1;
        System.out.println(rand_num);

    }
}
