import java.util.Scanner;

//beden kitle indeksine göre beden analizi yapma

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weight (kilogram): ");
        float mass = scanner.nextFloat();
        System.out.print("Please enter your height (metre): ");
        float height = scanner.nextFloat();

        float bmi = mass/(float)Math.pow(height,2);
        System.out.print("your body mass index: "+bmi);

        if(bmi<18.5) System.out.println("you are underweight!");
        else if (bmi<25) System.out.println("your weight is normal!");
        else if (bmi<30) System.out.println("you are overweight!");
        else System.out.println("you are an obese!");

    }
}