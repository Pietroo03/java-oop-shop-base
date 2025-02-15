package orgg.lessons.java.shop;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public byte iva;

    public Prodotto(String nome, String descrizione, float prezzo, byte iva) {
        this.codice = (int) (Math.random() * 100);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public void prezzoBase(float prezzo) {
        this.prezzo = prezzo;
    }

    public float prezzoConIva(float prezzo, byte iva){
        this.prezzo = prezzo;
        this.iva = iva;
        float prezzoConIva = prezzo + (prezzo / 100 * iva );
        return prezzoConIva;
    }
}
