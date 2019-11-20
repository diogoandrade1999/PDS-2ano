/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n81258;


/**
 *
 * @author demo
 */
public class Apartamento implements Imovel{
    private final String type;
    private final String description;
    private final double price;
    
    public Apartamento(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }
    
        @Override
    public String type() {
        return type;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString(){
        return String.format("Apartamento \t\t [type=%s, description=%s,"
                + " price=%.1f]"
                ,type(),description(),price());
        
    }

}
