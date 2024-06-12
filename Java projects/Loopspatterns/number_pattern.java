package Loopspatterns;
public class number_pattern {
    public static void main(String []args){
        int n = 5;
        int number = 1;
        //outerloops
        for(int i = 1; i<=n; i++ ){
            //innerloops
            for(int j = 1; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }System.out.println();
        }   
    }
    
}
