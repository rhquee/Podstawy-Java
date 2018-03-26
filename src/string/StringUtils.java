package string;

/**
 * Created by Lenovo on 2018-03-01.
 */
public class StringUtils {
 //   public static String removeSpaces(String param) {
//        String result = "";
//        int i = 0;
//        while (i < param.length() - 1) {
//            char c = param.charAt(i);
//            char c1 = param.charAt(i+1);
//            if (c == ' ' && c == ' ') {
//            i++;
//            } else {
//                result = result + c;
//                i++;
//            }
//            if(c!=' ' || c1 !=' '){
//                result = result + c;
//            }
//            i++;
//        }
//        return result;
//    }

    public static String removeSpaces(String param) {
        String result = "";
        int i = 0;
        while (i < param.length() - 1) {
            char c = param.charAt(i);
            char c1 = param.charAt(i + 1);
            if (c != ' ' || c1 != ' ') {
                result = result + c;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
//        String withoutSpaces = "groszek pierdzioszek";
//        System.out.println(removeSpaces2(withoutSpaces));

//        String s = "0123456789";
//        //s = null;
//        //String s2 = s.substring(0, 3);
//        //s = null;
//
//        String s3 = new String(s.substring(5));
//        //s = null;
//        //String s4 = s.substring(6);
//        //String s5 = new String(s.substring(8));
//
//        System.out.println(s);
//        //System.out.println(s2);
//        System.out.println(s3);
////        System.out.println(s5);


        String nameOne = "Napis Pieprwspzyp";
        String nameTwo = new String ("Napis Drugi");

        //ilosc znaków w napisie, z bialymi znakami
        System.out.println(nameOne.length());
        //litera na miejscu danego indeksu
        System.out.println(nameOne.charAt(2));
        //czy wyrazenie zawiera ""
        System.out.println(nameOne.contains("pis"));
        //na jakim nrze indeksu jest dany char
        System.out.println(nameOne.indexOf("pi"));
        System.out.println(nameOne.lastIndexOf("p"));
        //zostawia to co pomiędzy indeksami
        System.out.println(nameOne.substring(1,3)); //czyli na indeksie 1 i 2 (dlugosc - 1 = 3 - 1)
        //ucina to co przed/za indeksem
        System.out.println(nameOne.substring(3,10));

        System.out.println(nameOne.toLowerCase()); //toUpperCase

        System.out.println(nameOne.startsWith("Nap")); //true
        System.out.println(nameOne.startsWith("nap")); //false

        System.out.println(nameOne.endsWith("zyp")); //true
        System.out.println(nameOne.endsWith("zyp ")); //false

        String stringThree = "   napis       trzy   du   zo   spa   cji";
        System.out.println(stringThree.trim()); //usuwa spacle z lewej i prawej

        System.out.println(stringThree.replaceAll(" ", "")); //usuwa WSZYSTKIE spacje z wyrazenia

        //zaimplementuj metode do usuwania
        // bialych znakow ze srodka stringa
        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.removeSpaces(stringThree.trim()));


        double pi = 3.141595;
        // System.out.println(String.format("Pi = %.2f", pi)); //stringi = s, deimale d, double i floaty = f
        System.out.printf("Pi = %.2f\n", pi); //stringi = s, deimale d, double i floaty = f
        //spróbuj z \n i bez \n

        int height = 200;
        System.out.printf("Hajt (int) = %d\n", height);

        boolean isTrue = true;
        System.out.printf("Is true?: %b\n", isTrue);

        int height2 = 200;
        System.out.printf("Hajt (integer) = %d\n", height2);

        char sign = 'a';
        System.out.printf("Sign: %c\n", sign);

        int numerek = Integer.parseInt("123");
        System.out.println(numerek+1);

        String napis = String.valueOf(444.22);
        System.out.println(napis);
    }

    }



