import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the 'a' side: ");
        float a = input.nextFloat();
        System.out.println("Type in the 'b' side: ");
        float b = input.nextFloat();
        System.out.println("Type in the 'c' side: ");
        float c = input.nextFloat();
        if (a+b>c & a+c>b & b+c>a){
            System.out.println("This can be a triangle");
        }
        else{
            System.out.println("This can't be a triangle");
        }
    }
}