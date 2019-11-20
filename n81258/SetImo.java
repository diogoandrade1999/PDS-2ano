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
class SetImo implements Imovel{
    private final String name;
    private final String description;
    private double price;
    
    Set<Imovel> conjunto = new HashSet<>();
    
    SetImo(String nome, String descr) {
        this.name = nome;
        this.description = descr;
    }

    void add(Imovel im) {
        conjunto.add(im);
    }

    @Override
    public String type() {
        return "";
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public double price() {
        price = 0;
        Iterator<Imovel> it = conjunto.iterator();
        int i = 0;
        while(it.hasNext()){
            i++;
            price += it.next().price();
        }
        if (i > 1) price = price - (price*0.07);
        return price;
    }
    
    @Override
    public String toString(){
        String s = String.format("Lote de %d imóveis. Preço: %.0f\n",conjunto.size(),
                price());
        
        for (Imovel i: conjunto){
            s = s.concat("\t" + i.toString());
        }
        return s;
    }
}
