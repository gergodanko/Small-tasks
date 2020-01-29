import java.util.Scanner;

public class circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        double kerulet = 2 * radius * 3.14;
        double terulet = radius * radius * 3.14;
        double felszin =4 * 3.14 * radius * radius;
        double terfogat = (4 * 3.14 * radius * radius * radius) / 3;
        System.out.printf("The kerulet is : %.2f \n", kerulet);
        System.out.printf("The terulet is : %.2f\n", terulet);
        System.out.printf("The felszin is : %.2f\n", felszin);
        System.out.printf("The terfogat is : %.2f\n",terfogat);
    }
}