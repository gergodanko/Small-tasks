import java.util.Scanner;

public class IndexSeasons{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the index of the month: ");
        int monthIndex = input.nextInt();
        if(monthIndex == 12 || monthIndex == 1 || monthIndex == 2){
            System.out.println("Winter");
        }else if(monthIndex == 3 || monthIndex == 4 || monthIndex == 5){
            System.out.println("Spring");
        }else if(monthIndex == 6 || monthIndex == 7 || monthIndex == 8){
            System.out.println("Summer");
        }else if(monthIndex == 9 || monthIndex == 10 || monthIndex == 11){
            System.out.println("Autumn");
        }
    }
}