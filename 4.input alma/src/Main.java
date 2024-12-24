import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter your age:");
        int yas=scanner.nextInt();
        System.out.println("your age: "+ yas);

        if(scanner.hasNextInt()){
            int sayi=scanner.nextInt();
            System.out.println("Sayi: "+sayi);
        }
        else{
            System.out.println("Please enter a number...");
        }
    }
}