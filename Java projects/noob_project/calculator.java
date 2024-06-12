package noob_project;
import java.util.*;

public class calculator {
    public static void main(String[]args){

        
    double a;
    double b;
    double sum = a + b;
    double diff = a - b;
    double mul = a * b;
    double divide = a / b;
    double module = a % b;

    Scanner sc = new Scanner(System.in);
     char button = sc.next().charAt(0);

    switch(button) {
        case '+' : System.out.println(sum);
        break;
        case '-' : System.out.println(diff);
        break;
        default : 
    }


    }
}
