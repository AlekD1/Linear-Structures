import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        double a,b,z,x;
        System.out.println("Введите значение параметра a: ");
        a = in.nextDouble();
        System.out.println("Введите значение параметра b: ");
        b = in.nextDouble();
        System.out.println("Введите значение параметра x: ");
        x = in.nextDouble();

        if (x<=a)
            z = pow(x,2)+sin(x);
        else if ((a<x) && (x<b))
            z = cos(pow(x,2));
        else if ((x>=b) && (x!=3.14/2) && (x != (3*3.14)/2))
            z = tan(x);
        else z=0;
        System.out.printf("Значение функции z = %f\n", z);
    }
}
