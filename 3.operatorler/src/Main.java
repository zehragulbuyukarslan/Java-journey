import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        /*
        + ---> toplama
        - ---> çıkarma
        * ---> çarpma
        / ---> bölme
        % ---> kalan
         */

        System.out.println(4+3.2);
        System.out.println(3-5f);
        System.out.println(10/4);  //iki değer de int olduğu için sonuç int
        System.out.println(10f/4);
        System.out.println(15%4);

        int a=4;
        a+=2;
        System.out.println(a);

        int b=78;
        b--;
        System.out.println(b);
    }
}