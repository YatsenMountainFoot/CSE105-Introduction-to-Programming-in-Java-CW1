import java.util.*;

public class Q3TriangleAnalysis {

    public static void main(String[] args) {
        boolean continueInput = true;
        Scanner input = new Scanner(System.in);
        do{
        try{
        System.out.println("Please Eneter three numbers for the 3 sides of the triangle:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(a >0 && b > 0 && c > 0){
            if(a + b > c && a + c > b && b + c > a ){
                if(a == b && b ==c)
                    System.out.println("The triangle is equilateral!");
                else    if(a == b || b == c || a == c)
                            System.out.println("The triangle is isosceles!");
                        else
                            System.out.println("The triangle is Scalene!");
            continueInput = false;
            }
            else
                System.out.println("The numbers can not build a trangle!");
        }
        else
            System.out.println("Nonpositive numbers are meaningless!");
        }
        catch(InputMismatchException ex){
            System.out.println("Only numerical input accepted!");
            input.nextLine();
        }
        }while(continueInput);
    }
    
}
