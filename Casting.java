public class Casting {
    public static void main(String[]args){
        int x=12;
        //implicit casting
        double y=x+2;
        System.out.println(y);
        double z=1.11;
        int w=(int)z+2;
        System.out.println(w);
        String a="1";
        int v=Integer.parseInt(a);
        System.out.println(v+w);
    }
}
