public abstract class Osoba {
    //klasa abstarakcyjna nie pozwala na utworzenie tej klasy
    //moze byc wykorzystana do dziedziczenia
    public String imie;//publiczne pola i metody dostepne wszedzie
    private int wiek;//prywatne pola i metody dostepne tylko w tej klasie
    //hermetyzajca
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba() {
        imie = "Jaś";
        wiek = 0;
    }
    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        if (wiek<0) {
            this.wiek = 0;
        }
        else{
            this.wiek = wiek;
        }

    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
