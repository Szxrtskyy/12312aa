import java.util.ArrayList;

public class Klasa {
private String nazwaKlasy;
private Wychowawca wychowawca;
private ArrayList<Uczen> uczniowie;
public void usunUczniaZKlasy(Uczen uczen){
    if (uczniowie.contains(uczen)){
        uczniowie.remove(uczen);
    }else{
        System.out.println("Nie mozna usunac ucznia ktorego nie ma w klasie");
    }
}
    public String getNazwaKlasy() {
        return nazwaKlasy;
    }

    public void setNazwaKlasy(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
        uczniowie = new ArrayList<>();
    }

    public Wychowawca getWychowawca() {
        return wychowawca;
    }

    public void setWychowawca(Wychowawca wychowawca) {
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }

    public ArrayList<Uczen> getUczniowie() {
        return uczniowie;
    }

    public void setUczniowie(ArrayList<Uczen> uczniowie) {
        this.uczniowie = uczniowie;
    }

    public Klasa(String nazwaKlasy, Wychowawca wychowawca) {
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;


    }

    public Klasa(String nazwaKlasy, Wychowawca wychowawca, ArrayList<Uczen> uczniowie) {
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;
        this.uczniowie = uczniowie;

    }

    public void dodajUcznaDoKlasy(Uczen uczen) {
        if (uczniowie.contains(uczen)) {
            System.out.println(" jest juz w tej klasie");
        } else {
            uczniowie.add(uczen);
        }
}

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaKlasy='" + nazwaKlasy + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
