import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please enter the amount of euro to be paid per km: ");
        double eu= scanner.nextDouble();

        System.out.print("Please enter how many km did you travel: ");
        int km= scanner.nextInt();

        double amount= eu*km;
        System.out.println("total amount you need to pay is: " +amount);

    }
}