package Loopspatterns;
public class star_up_down {
    public static void main(String []args){

        int n = 6;

        //outerloops
        for(int i=6; i>=1; i--){
            //innerloop
            for(int j=1; j<=i; j++){
                System.out.print(i);

            }
            System.out.println();

        }

            
          //outerloops
        for(int k = 1;k<=n; k++){
              //innerloops
            for(int m= 1; m<=k; m++){
                System.out.print(k);
                }
                System.out.println();
            }
            
        
    }
    
}
