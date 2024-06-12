package loops;
public class Continue_condition_whileloop {
    public static void main(String []args){
        int n =1;

        while(n<=100){
            if( n%2 ==0){
                n++;
                continue;
            }
            System.out.print(n+ " ");
            n++;
        }
    }
    
}
