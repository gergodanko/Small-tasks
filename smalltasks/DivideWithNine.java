import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
public class DivideWithNine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the number: ");
        int number = input.nextInt();
        int sum= 0;
        String noAsText = Integer.toString(number);
        String[] listed = noAsText.split("");
        for(String no : listed){
            sum += Integer.parseInt(no);
        }
        if (sum%9 == 0){
            System.out.println("It can be divided by 9");
        }
        else{
            System.out.println("It can't be divided by 9");
        }
    }
}