import java.util.Scanner;
public class negorpos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the number you want to check: ");
        double num= input.nextDouble();
        if (num>=0){
            System.out.println("The number is positive!");
        }
        else{
            System.out.println("The number is negative!");
        }

    }
}