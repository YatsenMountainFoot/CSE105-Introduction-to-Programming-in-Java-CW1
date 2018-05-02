import java.util.*;

public class Q4LeapYear {

    public static void main(String[] args) {
        boolean continueInput = true;
        do{
        Scanner input = new Scanner(System.in);
        try{
            System.out .println("Please Enter the year to be testified:");
            int yearEntered = input.nextInt();
        
            leapOrNot(yearEntered);
            continueInput = false;
        }
        catch(InputMismatchException ex){
            System.out.println("Incorrect input. Try again! A year is at least an integer(if NOT positive)!");
            input.nextLine();//Discard input
        }
        }while(continueInput);
    }
    
    public static void leapOrNot(int x){
        
        if( x % 4 == 0 && x % 100 != 0)
        System.out.println(x + " is a leap year!");
        else    if(x % 400 == 0)
                System.out.println(x + " is a leap year!");
                else
                System.out.println(x + " is NOT a leap year!");
        
    }
}
