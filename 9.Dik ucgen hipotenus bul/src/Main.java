import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("please enter one of the right side of the triangle: ");
        int a= scanner.nextInt();
        System.out.println("please enter other right side of the triangle: ");
        int b= scanner.nextInt();

        float c= (float)Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("hypotenus of the triangle is: "+c);


    }
}