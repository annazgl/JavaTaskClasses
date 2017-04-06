package Zad5;

import java.time.LocalDate;

public class Main {

    /*Zdefinuj klasę Product posiadającą name,description, specification. Dodaj odpowiedni konstruktor. Zdefiniuj Klasę
    Guarantee, która odnosi się do danego produktu oraz dodatkowy atrybut validUntil. Zdefiniuj metodę publiczną
    isValid. Jeśli produkt jest ważny zwraca true w przeciwnym wypadku false. Jeśli Gwarancja jest nieważna to czyści
    Gwarancję ustawiając validUntli oraz product na null.*/

    public static void main(String[] args) {
        Product product = new Product("Pralka Bosh", "super pralka", "good");
        Product notebook = new Product("Macbook air", "najnowsza generacja", "good");
        Product telephone = new Product("Samsung Galaxy S5", "samsung:)","good" );

        Guarantee guarantee = new Guarantee(LocalDate.of(2018,10,1));
        guarantee.setProduct(product);

        Guarantee invalidGuarantee = new Guarantee(LocalDate.of(2015,2,2));
        invalidGuarantee.setProduct(product);

        Guarantee myGuarantee = new Guarantee(notebook,LocalDate.of(2017,10,10));
        Guarantee lastGuarantee = new Guarantee(telephone, LocalDate.of(2011,1,1));

        if(!invalidGuarantee.isValid()){
            System.out.println("Gwarancja jest nieważna");
            invalidGuarantee.clearGuaranteeIfIsInvalid();
        }
        if(myGuarantee.isValid()){
            System.out.println("Gwarancja jest ważna");
        }
    }
}