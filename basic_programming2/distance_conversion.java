//Write a program the find the distance in yards and miles for the distance provided by user in feets.
import java.util.Scanner;
class distance_conversion{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the distance in feets:-");
        float feets=input.nextFloat();
        float  yards ;
        yards=(feets/3);
        float miles;
        miles=yards/1760;
        System.out.println("the distance in yards-: "+yards);
        System.out.println("the distance in miles-:"+miles);
        
    }
}