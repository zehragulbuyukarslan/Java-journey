import java.util.Scanner;

//grade calculation
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your first visa grade: ");
        int v1 = scanner.nextInt();
        System.out.print("enter your second visa grade: ");
        int v2 = scanner.nextInt();
        System.out.print("enter your final grade: ");
        int f = scanner.nextInt();

        double result = (double)(v1*3/10)+(double)(v2*3/10)+(double)(f*4d/10);
        System.out.println("your avarage grade is: " +result);

        if(result>=90) System.out.println("Letter Grade: AA (successful)");
        else if (result>=85) System.out.println("Letter Grade: BA (successful)");
        else if (result>=80) System.out.println("Letter Grade: BB (passed)");
        else if (result>=75) System.out.println("Letter Grade: CB (passed)");
        else if (result>=70) System.out.println("Letter Grade: CC (passed)");
        else if (result>=65) System.out.println("Letter Grade: DC (passed)");
        else if (result>=60) System.out.println("Letter Grade: DD (unsuccessful)");
        else if (result>=55) System.out.println("Letter Grade: FD (unsuccessful)");
        else System.out.println("Letter Grade: FF (unsuccessful)");
        

    }
}