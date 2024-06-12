package loops;
public class Do_while_break_condition {
    public static void main(String [] args){
        int n = 0;
        do{
            System.out.print(n+ " ");
            n++;
            if(n==55){
                break;
            }
        } while(n<=100);


    }
    
}
