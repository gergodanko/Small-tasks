import java.util.Scanner;
public class ForeignHello{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you speak hungarian? (Yes/No): ");
        String answerHun = input.nextLine();
        System.out.print("Do you speak english? (Yes/No): ");
        String answerEng = input.nextLine();
        System.out.print("Do you speak spanish? (Yes/No): ");
        String answerEsp = input.nextLine();
        if(answerHun.equals("Yes") || answerHun.equals("yes")){
            System.out.println("Jó napot kívánok!");
        }
        if (answerEng.equals("Yes") || answerEng.equals("yes")){
            System.out.println("Good afternoon!");
        }
        if (answerEsp.equals("Yes") || answerEsp.equals("yes")){
            System.out.println("Buenas tardes!");
        }
        if (answerHun.equals("No") || answerHun.equals("no") && answerEng.equals("No") || answerEng.equals("no") && answerEsp.equals("No") || answerEsp.equals("no")){
            System.out.println("♥");
        }
    }
}