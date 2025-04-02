public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    public Produkt(int id, String nazwa, String kategoria, double cena, int iloscWMagazynice) {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.setCena(cena);
        this.setIloscWMagazynie(iloscWMagazynice);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getKategoria() {
        return kategoria;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        if(cena<0){
            throw new IllegalArgumentException("Cena musi być większa bądź równa 0");
        }
        this.cena = cena;
    }
    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }
    public void setIloscWMagazynie(int iloscWMagazynice) {
        if(iloscWMagazynice<0){
            throw new IllegalArgumentException("Ilośc w magazynie musi być większa bądź równa 0");
        }
        this.iloscWMagazynie = iloscWMagazynice;
    }
    public void wyswietlInformacje() {
        System.out.println("Produkt ID: "+id);
        System.out.println("Nazwa: "+nazwa);
        System.out.println("Kategoria: "+kategoria);
        System.out.println("Cena: "+cena);
        System.out.println("Ilosc W Magazynice: "+iloscWMagazynie);
    }
}
