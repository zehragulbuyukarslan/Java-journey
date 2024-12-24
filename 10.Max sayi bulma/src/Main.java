import java.util.Scanner;

//Girilen üç sayıdan en büyüğünü bulma

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter the first number: ");
        int a= scanner.nextInt();
        System.out.print("please enter the second number: ");
        int b= scanner.nextInt();
        System.out.print("please enter the third number: ");
        int c= scanner.nextInt();

        int temp= a;
        if (b>temp) temp=b;
        if(c>temp) temp=c;

        System.out.println("The gratest number is: "+temp);

    }
}