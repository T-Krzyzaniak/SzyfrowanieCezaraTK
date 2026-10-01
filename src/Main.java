import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    private static int opcja;
    private static String strona;
    private static String haslo;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pliki start = new Pliki();
        SzyfrowanieK szyfr = new SzyfrowanieK();
        start.checkFile();
        while(opcja!=3) {
            System.out.println("Wybierz opcje: \n1.Dodaj nowe hasło.\n2.Odczytaj hasła.\n3.Zakończ.");
            opcja = scan.nextInt();

            if (opcja == 1) {
                System.out.println("Podaj nazwe strony:");
                strona = "Strona:" + " " + scan.next();
                System.out.println("Podaj haslo");
                haslo = "Haslo:" + " " + scan.next();
                String szyfrhaslo = szyfr.szyfruj(strona + " " + haslo,6);
                start.writeToFile(szyfrhaslo + "\n");
            } else if (opcja == 2) {
                start.readFile();
            } else if (opcja == 3) {
                System.out.println("Program zakończony, miłego dnia");
            } else {
                System.out.println("Wybrana opcja nie istnieje.");
            }
        }

/*
        Szyfrowanie test = new Szyfrowanie();
        String trzymaj = test.szyfruj("Mam nadzieje ze ta wiadomosc jest dobrze szyfrowana");
        System.out.println(trzymaj);

        Odszyfrowanie test1 = new Odszyfrowanie();
        String trzymaj1 = test1.odszyfruj("Sgs tgjfokpk fk zg cogjusuyi pkyz juhxfk yfelxucgtg");
        System.out.println(trzymaj1);

        SzyfrowanieK test2 = new SzyfrowanieK();
        String trzymaj2 = test2.szyfruj("Mam nadzieje ze ta wiadomosc jest dobrze szyfrowana",6);
        System.out.println(trzymaj2);

        OdszyfrowanieK test3 = new OdszyfrowanieK();
        String trzymaj3 = test3.odszyfruj("Sgs tgjfokpk fk zg cogjusuyi pkyz juhxfk yfelxucgtg",6);
        System.out.println(trzymaj3);

        Pliki test4 = new Pliki();
        test4.checkDirectory();

 */
    }

    }
