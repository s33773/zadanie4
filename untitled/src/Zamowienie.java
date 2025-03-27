public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkt;
    private int[] ilosc;
    private String dataZamowienia;
    private String status;

    public Zamowienie(int id, Klient klient, Produkt[] produkt, String dataZamowienia, String status){
        this.id = id;
        this.klient = klient;
        this.produkt = produkt;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }
    public int getId(){
        return id;
    }
    public Klient getKlient(){
        return klient;
    }
    public Produkt[] getProdukt(){
        return produkt;
    }
    public String getDataZamowienia(){
        return dataZamowienia;
    }
    public String getStatus(){
        return status;
    }

}
