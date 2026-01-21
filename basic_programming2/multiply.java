//Write a program to input the unit price of an item and the quantity to be bought. Then,
//calculate the total price.
import java.util.Scanner;
class multiply{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the unit price:-");
        float a=input.nextFloat();
        System.out.println("enter the quantity:-");
        float b=input.nextFloat();
        double c;
        c=a*b;
        System.out.println("the total price:- "+c);
    }
}