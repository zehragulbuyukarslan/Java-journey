import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("programi kapatmak icin: -1");
        while (true){
            System.out.print("islem no giriniz: ");
            int islem = scanner.nextInt();

            if (islem==-1){
                System.out.println("program kapanıyor...");
                break; }

            System.out.println("islem: "+islem);
        }

        for (int i=0; i<=10; i++){
            if (i==3 || i==5)
                continue;
            //continue while döngüsü ile kullanılması riskli
            System.out.println("i="+i);

        }

    }
}