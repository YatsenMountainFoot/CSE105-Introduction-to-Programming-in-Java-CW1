import java.util.*;

public class Q1ComputeFactorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do{
        try{
            System.out.println("Please Enter an integer betwwen 0 and 20 to compute the factorial:");
            int numberEntered = input.nextInt();
            
            if(numberEntered >= 0 && numberEntered <= 20){
                System.out.println("The factorial of " + numberEntered + " is " + factorial(numberEntered));
            }
            else{
                throw new InputMismatchException("Number range restricted!");
            }
            continueInput = false;
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input. Try again! An integer in the restricted range is required!");
            input.nextLine();//Discard input
        }
        }while(continueInput);
    }
   
    public static long factorial(int x){
        long result;
        
        for(result = 1; 0 < x; x--){
        result *= x;
        }
        
        return result;
    }
}