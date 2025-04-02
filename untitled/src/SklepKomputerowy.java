import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();
    private ArrayList<Zamowienie> zamowienia = new ArrayList<>();
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie(zamowienia.size() + 1, klient, produkty, ilosci);
        zamowienia.add(zamowienie);
        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] produktyZamowione = zamowienie.getProdukty();  // Pobieramy produkty z zamówienia
        int[] ilosciZamowione = zamowienie.getIlosci();
        for (int i = 0; i < produktyZamowione.length; i++) {
            Produkt produkt = produktyZamowione[i];
            int iloscZamowiona = ilosciZamowione[i];
           produkt.setIloscWMagazynie(produkt.getIloscWMagazynie()-iloscZamowiona);
        }
    }
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus){
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
                System.out.println("Status zamówienia: " + nowyStatus);
                return;
            }
        }
        System.out.println("Zamówienie nie istnieje");
    }
    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equals(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }
    public boolean wyswietlZamowieniaKlienta(int idKlienta) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getKlient().getId() == idKlienta) {
                zamowienie.wyswietlSzczegoly();
                return true;
            }
        }
        return false;
    }

    }




