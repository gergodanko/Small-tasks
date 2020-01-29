import java.util.Scanner;
public class Sumetc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the first number: ");
        float a = input.nextFloat();
        System.out.print("Type in the second number: ");
        float b = input.nextFloat();
        System.out.printf("Sum : %.2f\n", a+b);
        System.out.printf("Difference : %.2f\n", a-b);
        System.out.printf("Multiply : %.2f\n", a*b);
        System.out.printf("Quotient : %.2f", a/b);
    }
}