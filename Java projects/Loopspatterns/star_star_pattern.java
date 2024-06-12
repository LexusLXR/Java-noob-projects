package Loopspatterns;
public class star_star_pattern {
    public static void main(String []arg){
        int i = 6;
        //outerloops
        for(i = 6; i>=1; i--){
            //innerloops
            for(int j = 1; j<=i; j++){
                System.out.print( "*");
            }
            System.out.println();
        }
        
    }
    
}
