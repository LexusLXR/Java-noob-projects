package Casting;
public class Casting {
    //Type casting
    public static void main(String [] args){
        int a = 100;
        float b = 100; // widening 
        System.out.println(a);
        System.out.println(b);

        float x = 100.1f;
        int y = (int)x; //narrowing 
        System.out.println(x);
        System.out.println(y);

        long alpha = 5555555;
        short beta = (short)alpha; //overflow
        System.out.println(alpha);
        System.out.println(beta);
    }

    
}
