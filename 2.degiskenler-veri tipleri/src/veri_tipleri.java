public class veri_tipleri {
    public static void main(String[] args){

        System.out.println("long veri tipi max ve min degerleri:");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("------------------------------------");

        System.out.println("integer veri tipi max ve min degerleri:");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("-------------------------------------");

        System.out.println("short veri tipi max ve min degerleri:");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("-------------------------------------");

        System.out.println("byte veri tipi max ve min degerleri:");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("--------------------------------------");

        double a= 5.25;
        double b= 4.0;
        double c= 6d;
        double d= 7.145d;

        float f= (float)5.0;
        float g= 5f;
        float h= 5.2f;

        char abc= 'A';
        char klm= 500;
        System.out.println(abc);
        System.out.println(klm);

        boolean arg1 = true;
        boolean arg2 = false;

        String s1= "Java ";
        String s2= "Programlama ";
        String s3= "Dili";
        System.out.println(s1+s2+s3);

        char chr= '?';
        String str= "Merhaba, nasılsın";
        System.out.println(str+chr);
        String str1= "Merhaba, nasılsın" +chr;
        System.out.println(str1);

    }
}
