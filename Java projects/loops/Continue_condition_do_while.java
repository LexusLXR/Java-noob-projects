package loops;
public class Continue_condition_do_while {
    public static void main(String []args){
        int n=1;

        do{
            if(n%2 == 0){
                n++;
                continue;
            }
            System.out.print(n+ " ");
            n++;    
        }while(n<=100);
    }
    
}
