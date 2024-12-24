import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your mass: ");
        double m= scanner.nextDouble();

        System.out.println("Please enter your height: ");
        double h= scanner.nextDouble();

        System.out.println("Your body mass index is:" +(m/(h*h)));

    }
}