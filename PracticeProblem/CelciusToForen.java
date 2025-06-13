import java.util.Scanner;

public class CelciusToForen {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius : ");
        float celsius = sc.nextFloat();

        float Fahrenheit = (celsius * 9/5) + 32;
        System.out.println("temperature in fahrenheit : " +Fahrenheit);
    }
}