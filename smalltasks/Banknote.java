import java.util.Scanner;

public class Banknote{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the amount: ");
        int money = input.nextInt();
        int thousand = 0;
        int fiveHundred = 0;
        int hundred = 0;
        int fifty = 0;
        int ten = 0;
        int one =0;
        
        
        if (money/1000>=1){
            thousand+=money/1000 ;
            money-=(money/1000)*1000;   
        }
        if (money/500>=1){
            fiveHundred+=money/500;
            money-=(money/500)*500;
        }
        if (money/100>=1){
            hundred+=money/100;
            money-=(money/100)*100;
        }
        if (money/50>=1){
            fifty+=money/50;
            money-=(money/50)*50;
        }
        if (money/10>=1){
            ten+=money/10;
            money-=(money/10)*10;
        }
        one = money;
        System.out.printf("%d thousands\n%d five hundreds\n%d hundreds\n%d fifties\n%d tens\n%d ones\n",thousand,fiveHundred,hundred,fifty,ten,one);
        

    }
}