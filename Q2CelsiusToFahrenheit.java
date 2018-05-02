public class Q2CelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        System.out.println("Celsius\t\t\tFahrengeit");
        
        int i;      //Declare a counter
        for(i = 1; i <=100; i++){
            celsius = (100*(Math.random())-50);
            fahrenheit = celsius * 9.0 / 5.0 + 32.0;
            System.out.println(Math.round(celsius) + "\t\t\t" + Math.round(fahrenheit));
        }
            
    }
    
}
