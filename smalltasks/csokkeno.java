import java.util.Scanner;
import java.util.Arrays;
public class csokkeno{
    public static void main(final String[] args) {
        final int[] nums = new int[3];
        final Scanner input = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.printf("Type in the %d. number ",i+1);
            nums[i]=input.nextInt();
        }
        Arrays.sort(nums);
        for (int i=2;i>=0; i--){
            System.out.printf("%d ",nums[i]);
        }
        
        


        
    }
}