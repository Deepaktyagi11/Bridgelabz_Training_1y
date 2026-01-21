//The University is charging the student a fee of INR 125000 for the course. The University is
//willing to offer a discount of 10%. Write a program to find the discounted amount and
//discounted price the student will pay for the course.
import java.util.Scanner;
class Discount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the college fees:-");
        int fees = input.nextInt();
        System.out.println("enter discount amount:-");
        int dis=input.nextInt();
        int dis_amount= (fees/100)*dis;
        System.out.println("amount saved by discount:- " +dis_amount);
        int pay_amount= fees-dis_amount;
        System.out.println("amount pay after discount:- "+pay_amount); 
    }
}