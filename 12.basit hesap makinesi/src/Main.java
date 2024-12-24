import java.util.Scanner;

//a simple calculator
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, result=0;
        System.out.print("enter the first value: ");
        a = scanner.nextDouble();
        System.out.print("enter the second value: ");
        b = scanner.nextDouble();
        System.out.print("enter the operation you want to perform: ");
        scanner.nextLine();
        String operation = scanner.nextLine();

        switch (operation){
            case "+" :
                result = a+b;
                break;
            case "-" :
                result = a-b;
                break;
            case "." :
                result = a*b;
                break;
            case "/" :
                result = a/b;
                break;
            default:
                System.out.println("you entered invalid operation!");
        }
        System.out.print("The result: "+result +"\n");
    }
}