import java.util.*;
public class IfElse {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a;
        a=sc.nextInt();
        System.out.println("Guess the number");
        int b;
        b=sc.nextInt();
        if(a==b){
            System.out.println("You have guessed the number");
        }
        if (a!=b && a>b) {
            System.out.println("The number is greater than the guessed number");
        } else {
         System.out.println("The number is less than the guessed number");   
        }

    }
    
}
