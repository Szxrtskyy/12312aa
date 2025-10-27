public class Main {
    public static void main(String[] args) {

        Osoba osoba1 = new Uczen();
        System.out.println(osoba1.imie);
        osoba1.imie = "Jaś";
        System.out.println(osoba1.imie);
        Uczen uczen = new Uczen("Emil",12,1234);
        System.out.println(uczen);
        uczen.setWiek(14);
        System.out.println(uczen);

        Uczen uczen1 = new Uczen("fiona",10);
        System.out.println(uczen1);
        System.out.println("Liczna uczniow "+Uczen.getLiczbaUczniow()+"");
        Uczen uczen2 = new Uczen("Szrek",15);
        System.out.println(uczen2);
        System.out.println("Liczna uczniow "+Uczen.getLiczbaUczniow()+"");

        Wychowawca nauczcielFizyki = new Wychowawca("Edmund",70,"fizyka");
        System.out.println(nauczcielFizyki);
        Wychowawca wychowawca = new Wychowawca("Ewelina",60,"technika");

        nauczcielFizyki.wykonajDyzur();
        uczen1.wykonajDyzur();
        //polimorfizm

        Klasa klasa = new Klasa("3a", (Wychowawca) nauczcielFizyki);
        System.out.println(klasa);
        klasa.dodajUcznaDoKlasy(uczen);
        klasa.dodajUcznaDoKlasy(uczen1);
        klasa.dodajUcznaDoKlasy(uczen2);
        System.out.println(klasa);
        klasa.dodajUcznaDoKlasy(uczen);

        Szkoła szkoła = Szkoła.zwrocObiektSzkola("ZS10");
        System.out.println(szkoła);
    }
}