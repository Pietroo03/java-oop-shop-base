package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        
        Prodotto penna = new Prodotto("Super Penna", "Facile da usare e infinita!", 4.99f);
        
        Prodotto gomma = new Prodotto("Gomma doppia faccia", "Gomma da cancellare doppia faccia, cancelli penna e matita!", 1.50f);

        Prodotto calcolatrice = new Prodotto();

        
        System.out.println(penna.getPrezzoConIva());
        System.out.println(gomma.getNomeEsteso());
        System.out.println(Prodotto.getIva());
        calcolatrice.setDescrizione("Utilissimaaa!");
        System.out.println(calcolatrice.getDescrizione());
    }

    
}
