package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        
        Prodotto penna = new Prodotto("Super Penna", "Facile da usare e infinita!", 4.99f, 22);
        
        Prodotto gomma = new Prodotto("Gomma doppia faccia", "Gomma da cancellare doppia faccia, cancelli penna e matita!", 1.50f, 22);

        
        System.out.println(penna.prezzoConIva());
        System.out.println(gomma.nomeEsteso());
    }

    
}
