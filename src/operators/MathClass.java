package operators;

/**
 * Created by kfrak on 18.03.2018.
 */
public class MathClass {
    public static void main(String[] args) {

        double pi = Math.PI; //dostęp do klasy Math jest statyczny, nic nie trzeba importować
        double e = Math.E;

        double a = Math.pow(4, 2); //4^2
        //double a = Math.pow(3, 3); //3^3
        System.out.println(a);

        double b = Math.sqrt(4); //zwraca pierwiastek kwadratowy tu: z 4 (square root)
        System.out.println(b);

        double c = Math.cbrt(27); //zwraca pierwiastek sześcienny tu: z 27 (cube root)
        System.out.println(c);

        double d = Math.pow(16, 1. / 4.); //pierwiastek 4 stopnia z 16, 16^(1/4); 1. = 1.0
        System.out.println(d);

        double f = Math.log(e);
        System.out.println(f);

        double g = Math.log10(100); //10^2 = 100
        double j = Math.log10(1000); //10^3 = 1000
        System.out.println(g);
        System.out.println(j);

        double h = Math.sin(Math.toRadians(90)); //sin dla kąta 90*
        System.out.println(h);

        int k = Math.abs(-4); //wartość bezwzględna
        System.out.println(k);


    }
}