import java.util.Scanner;

public class AverageTemp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float averages= 0;
        for(int i=0; i<12; i++){
            System.out.printf("Type in the %d. month's average temperature: ",i+1);
            averages += input.nextFloat();
        }
        System.out.printf("This year's average was: %f\n", averages/12);

    }
}