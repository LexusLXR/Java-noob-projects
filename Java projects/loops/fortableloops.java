package loops;
import java.util.*;

public class fortableloops {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        for(int counter = 1; counter <= 10; counter++){
            System.out.println(counter * n);
        }
    }
    
}
