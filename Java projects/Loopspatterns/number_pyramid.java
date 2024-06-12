package Loopspatterns;
public class number_pyramid {
    public static void main(String [] args){
        int n = 6;
        //outerloops
        for(int i = 1; i<=n; i++){
            //innerloops for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            
            }
            //innerloops 
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();


        }

    }
    
}
