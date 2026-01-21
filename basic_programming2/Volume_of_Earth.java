//Write a Program to compute the volume of Earth in km^3 and miles^3
import java.util.Scanner;
class Volume_of_Earth{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius:-");
        float r=input.nextFloat();
       float V = (4/3)*(22/7)*r*r*r;
        System.out.println("volume of earth in km:- "+V);
        double v1= (0.2399*V) ;
        System.out.println("volume of earth in miles:- "+v1);
    }
}