/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n81258;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author demo
 */
public class Moradia implements Imovel{
    
    private final Set<String> Chars;
    private final String type;
    private final String description;
    private final double price;
    
    
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
    


    public Moradia(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
        Chars = new HashSet<>();
    }
    
   

    public Moradia addChar(String Char){
        Chars.add(Char);
        return this;
    }
    
    @Override
    public String toString(){
        String s = String.format("Moradia \t\t [type=%s, description=%s, price=%.1f]\n"
                + "\tCaracteristicas: \t\t[",type(),description(),price());
        Iterator<String> it = Chars.iterator();
        while(it.hasNext()){
            s = s.concat(it.next() + ", ");
        }
        
        return s.substring(0,s.length()-2) + "]\n";
    }
}
