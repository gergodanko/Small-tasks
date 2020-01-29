import java.util.Scanner;
public class TrueOrFalse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type True or False: ");
        boolean bool=input.nextBoolean();
        if (bool){
            System.out.println("Igaz");
        }
        else{
            System.out.println("Hamis");
        }
    }
}