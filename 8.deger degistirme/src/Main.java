import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1= scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2= scanner.nextInt();

        int temp = n1;
        n1=n2;
        n2=temp;

        System.out.println("--------------------");
        System.out.println("first number: " +n1 +"\nsecond number: " +n2);


    }
}