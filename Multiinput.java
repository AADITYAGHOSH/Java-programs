import java.util.Scanner;
public class Multiinput {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a integer");
        int num=input.nextInt();
        System.out.println("The number you entered "+num);
        System.out.println("Enter a name");
        String name=input.next();
        System.out.println("The name you entered "+name);
    }
}