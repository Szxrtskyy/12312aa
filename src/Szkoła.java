import java.util.ArrayList;

public class Szkoła {
    //singleton
    private ArrayList<Nauczyciel>nauczyciels;
    private ArrayList<Uczen> wszyscyUczniowie;
    private String nazwa;

    private static Szkoła szkola;
    public static  Szkoła zwrocObiektSzkola(String nazwa){

        if (szkola == null) {
            szkola = new Szkoła("ZS10");
        }
        return szkola;
    }

    private Szkoła(String nazwa) {
        this.nazwa = nazwa;
        nauczyciels = new ArrayList<>();
        wszyscyUczniowie = new ArrayList<>();

    }

    public void dodajNauczyciela(Nauczyciel nauczyciel){
nauczyciels.add(nauczyciel);
    }
    public void przepiszUczniaZKlasyDoKlasy(Uczen uczen, Klasa zKlasy, Klasa doKlasy){
zKlasy.usunUczniaZKlasy(uczen);
doKlasy.dodajUcznaDoKlasy(uczen);
    }
    public void dodajUczniaDoSzkoły(Uczen uczen){
wszyscyUczniowie.add(uczen);
    }

    @Override
    public String toString() {
        return "Szkoła{" +
                "nauczyciels=" + nauczyciels +
                ", wszyscyUczniowie=" + wszyscyUczniowie +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
