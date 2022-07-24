public class Arraysum {
    public static void main(String[]args){
        int[] ages={10,11,12,11,15};
        int sum=0;
        double average;
        for(int age:ages){
            sum+=age;
        }
        double no= ages.length;
        average=(sum/no);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);


    }
}
