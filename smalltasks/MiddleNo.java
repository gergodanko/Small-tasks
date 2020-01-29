import java.util.Scanner;

public class MiddleNo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Type in the first number: ");
        float a = input.nextFloat();
        System.out.print("Type in the second number: ");
        float b = input.nextFloat();
        System.out.printf("The arithmetic middle: %.2f", (a+b)/2);
    }
}