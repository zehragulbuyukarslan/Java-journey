import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("enter your age and name:");

        Scanner scanner = new Scanner(System.in);

        int age= scanner.nextInt();
        scanner.nextLine();  //Dummy
        String name= scanner.nextLine();

        System.out.println("Enter your name and age:");

        String name1= scanner.nextLine();
        int age1= scanner.nextInt();  //no need a dummy input

        int age_a= scanner.nextInt();
        int age_b= scanner.nextInt();
        int age_c= scanner.nextInt();

        System.out.println("age a: "+age_a +" age b: " +age_b +" age c: "+age_c);

    }
}