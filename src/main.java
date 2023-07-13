import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double Kilo,Boy,Endeks;
        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Boy= veri.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        Kilo= veri.nextDouble();
        Endeks= Kilo/ (Boy * Boy);
        System.out.println("Vücut Kitle İndeksiniz : " + Endeks);



    }
}
