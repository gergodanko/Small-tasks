import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
public class DigitCounter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in a positive integer: ");
        int number = input.nextInt();
        String digits= Integer.toString(number);
        System.out.printf("It has %d digits.\n",digits.length());
    }
}