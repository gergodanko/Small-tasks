import java.util.Scanner;
public class Seasons{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the month with capital first letter: ");
        String month = input.nextLine();
        if(month.equals("December") || month.equals("January") || month.equals("February") ){
            System.out.println("Winter");
        }else if(month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("Spring");
        }else if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("Summer");
        }else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("Autumn");
        }
    }
}