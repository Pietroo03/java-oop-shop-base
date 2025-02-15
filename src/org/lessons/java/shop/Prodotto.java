package org.lessons.java.shop;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        this.codice = (int) (Math.random() * 100000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public float prezzoBase() {
        return this.prezzo;
    }

    public float prezzoConIva(){
        float prezzoConIva = prezzo + (prezzo / 100 * iva );
        return Math.round(prezzoConIva * 100) / 100.0f ;
    }

    public String nomeEsteso() {
        String nomeEsteso = Integer.toString(codice) + '-' + nome;
        return nomeEsteso; 
    }
}
