import java.util.Scanner;


public class CompanyIncome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in the income: ");
        int income = input.nextInt();
        System.out.print("Type in the expense: ");
        int expense = input.nextInt();
        if(income-expense>0){
            System.out.printf("The company was profitable: %d\n",income-expense);
        }else if(income-expense<0){
            System.out.printf("The company was in the red: %d\n",income-expense);
        }else{
            System.out.printf("The company broke even\n");
        }

    }
}