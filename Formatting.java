import java.text.NumberFormat;

public class Formatting {
    public static void main(String[]args){
        NumberFormat currency =NumberFormat.getCurrencyInstance();
        String result=currency.format(123456.789);
        System.out.println(result);
        NumberFormat percentage=NumberFormat.getPercentInstance();
        String result2= percentage.format(0.123);
        System.out.println(result2);
        System.out.println("These are the formatting methods");

    }
}
