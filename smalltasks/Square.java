import java.util.Scanner;
import java.lang.Math;
public class Square{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the block's side: ");
        double a = input.nextDouble();
        System.out.print("Type in the block's side: ");
        double b = input.nextDouble();
        System.out.print("Type in the block's side: ");
        double c = input.nextDouble();
        double lapatlo1=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double lapatlo2=Math.sqrt(Math.pow(b,2)+Math.pow(c,2));
        double lapatlo3=Math.sqrt(Math.pow(a,2)+Math.pow(c,2));
        System.out.printf("Lapatlok: %f , %f , %f \n",lapatlo1,lapatlo2,lapatlo3);
        System.out.printf("Testatlo: %f \n",Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)));
        System.out.printf("Felszin: %f\n",2*((a*b)+(a*c)+(b*c)));
        System.out.printf("Terfogat: %f\n",a*b*c);
    }
}