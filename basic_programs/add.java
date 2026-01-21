import java.util.Scanner;
class add{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your first number");
        int a=input.nextInt();
        System.out.println("enter your second num");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("add of two num;- "+sum);
    }
}