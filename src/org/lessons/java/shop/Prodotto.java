package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public float getPrezzoBase() {
        return this.prezzo;
    }

    public float getPrezzoConIva(){
        float prezzoConIva = prezzo + (prezzo / 100 * iva );
        return Math.round(prezzoConIva * 100) / 100.0f ;
    }

    public String getNomeEsteso() {
        String nomeEsteso = Integer.toString(codice) + " - " + nome;
        return nomeEsteso; 
    }
}
