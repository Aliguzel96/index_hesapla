package giris;
import java.util.Scanner;

public class endex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, index;
        System.out.println("Sirasiyla boy(metre cinsinden) ve kilo degerlerini giriniz: ");
        boy = input.nextDouble();
        kilo = input.nextDouble();

        index = kilo / (Math.pow(boy,2));
        System.out.println("Vücut kitle indeksiniz: " + index);


    }
}
