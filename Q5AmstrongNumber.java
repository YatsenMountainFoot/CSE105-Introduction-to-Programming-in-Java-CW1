import java.util.*;

public class Q5AmstrongNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean continueInput = true;
        do{
            try{
                System.out.println("Please enter an integer to test for Amstrong number");
                int numberEntered = input.nextInt();
                if(numberEntered <= 0)
                    throw new InputMismatchException("Given number should be positive!");
                else
                    amstrongNumberOrNot(numberEntered);
                continueInput = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Incorrect input. Try again! An Amstrong number should be both integer and positive");
                input.nextLine();
            }
        }while(continueInput);
    }
    
    public static void amstrongNumberOrNot(int x){
        int sum = 0;        //sum of cubed digits
        String xInString = x + "";      //Convert numberEntered to string.
        char[] xInChar = new char[xInString.length()];      
        for(int i = 0; i < xInString.length(); i++){
            xInChar[i] = xInString.charAt(i);       //Get every digit in Datatype char.
            sum += Math.pow( ((int)xInChar[i]-(int)'0'), 3);
        }        //Convert Datatype char to int and compute sum of cubed digits.
        
        if(x == sum)
            System.out.println("The enterd number is an Amstrong number!");
        else
            System.out.println("The enterd number is NOT Amstrong number!");
    }
}
