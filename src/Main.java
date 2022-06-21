import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kenar1,kenar2,hipotenus,cevre,alan,cevreToplam,alaninkaresi;
        System.out.print("1.Kenari giriniz : ");
        kenar1 = scan.nextDouble();
        System.out.print("2.Kenari giriniz : ");
        kenar2 = scan.nextDouble();
        System.out.print("Hipotenusu giriniz : ");
        hipotenus = scan.nextDouble();
        cevreToplam = (kenar1+kenar2+hipotenus)/2;
        cevre = 2*cevreToplam;
        System.out.println("Ucgenin cevresi = "+cevre);
        alaninkaresi= cevreToplam*(cevreToplam-kenar1)*(cevreToplam-kenar2)*(cevreToplam-hipotenus);
        alan = Math.sqrt(alaninkaresi);
        System.out.println("Ucgenin alani = "+alan);
    }
}
