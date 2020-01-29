import java.util.Scanner;
public class DlConversion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the dl: ");
        int dl = input.nextInt();
        int endL = 0;
        int endHl = 0;
        while(dl/1000>0){
            dl=dl - 1000;
            endHl=endHl + 1;
        }
        while(dl/10>0){
            dl=dl - 10;
            endL=endL + 1;
        }
        System.out.printf("That is %d hl %d l and %d dl",endHl,endL,dl);


    }
}