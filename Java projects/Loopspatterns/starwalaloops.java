package Loopspatterns;
public class starwalaloops {
    public static void main(String [] args) {
        int star = 6;
        for( star = 6; star>=1; star--) {
            for(int j = 1; j<=star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    
}
