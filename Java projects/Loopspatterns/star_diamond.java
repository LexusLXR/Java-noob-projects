package Loopspatterns;
public class star_diamond {
    public static void main(String[] args){
        int n = 6;

        //outerloop
        for(int i = 1; i<=n; i++){
            //innerloops space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //innerloops
            for(int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }System.out.println();
        }   
        
        //Backwards outerloops
        for(int i=5; i>=1; i--){
            //innerloops space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            
            //innerloops
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }System.out.println();
        
        }   

    
    
    }
    
}
