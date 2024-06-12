package loops;
public class break_condition_while {
    public static void main(String []args){
        int n= 9;
        while(n<=100){
            System.out.print(n+ " ");
            n++;
            if(n == 100){
                break;
            }
        }
    }
    
}
