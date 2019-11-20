/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n81258;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author demo
 */
public class ImoRealMonopolista implements ImovelManager{
    private final String nome;
    private static final ImoRealMonopolista imobiliaria = new ImoRealMonopolista("ImobilMonopólio");
    Map<String,Imovel> imoveis = new HashMap<>();
    
    private ImoRealMonopolista(String nome) {
        this.nome = nome;
    }
    
    public static ImoRealMonopolista getSingleton(){
        return imobiliaria;
    }
        
    
    
    @Override
    public boolean existeImovel(String code) {
        return imobiliaria.imoveis.containsKey(code);
    }

    @Override
    public boolean addImovel(String code, Imovel imo) {
        if (imobiliaria.existeImovel(code)) return false;
        imobiliaria.imoveis.put(code, imo);
        
        return true;
    }

    @Override
    public Imovel retiraImovel(String code) {
        return imobiliaria.imoveis.remove(code);
    }

    @Override
    public Iterator<String> iterator() {
        Set<String> returnVal = new HashSet<>();
        Iterator<String> it = imobiliaria.imoveis.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            returnVal.add("Ref: " + key + " - " + imobiliaria.imoveis.get(key));
        }
        return returnVal.iterator();
    }
}
