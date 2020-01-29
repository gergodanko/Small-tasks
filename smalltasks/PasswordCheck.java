import java.util.Scanner;

public class PasswordCheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String realPw = "Password1234";
        System.out.println("Type in your password: ");
        String userPw = input.nextLine();
        if(userPw.equals(realPw)){
            System.out.println("Login was successful!");
        }

    }
}