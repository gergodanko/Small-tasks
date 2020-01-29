import java.util.Scanner;

public class CoffeeMachine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Regular price is 30\n Choose coffee type:\n (1) Without cup(-10)\n (2) Double sugar(+20)\n (3) Foamy coffee(+50)");
        int choice = input.nextInt();
        if (choice==1){
            System.out.println("Please insert 20 ");
        }else if (choice == 2){
            System.out.println("Please insert 50 ");
        }else if (choice == 3){
            System.out.println("Please insert 80 ");
        }

    }
}