package Zad5;

import java.time.LocalDate;

public class Guarantee {
    //kompozycja(mechanizm zawierania jedno w drugie
    private Product product;
    private LocalDate validUntil;

    public Guarantee(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public String toString() {
        return "Guarantee{" +
                "product=" + product +
                ", validUntil=" + validUntil +
                '}';
    }

    public boolean isValid(){
        if(validUntil.isBefore(LocalDate.now()))
            return false;
        else
            return true;
        //lub return(validUntil.isBefore(LocalDate.now()) ? false : true);
    }

    public void clearGuaranteeIfIsInvalid(){
        if(!isValid())
            clear();

    }
    private void clear(){
        validUntil = null;
        product = null;
    }
}