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
public class ImoReal implements ImovelManager{

    Map<String,Imovel> imoveis = new HashMap<>();
    
    @Override
    public boolean existeImovel(String code) {
        return imoveis.containsKey(code);
    }

    @Override
    public boolean addImovel(String code, Imovel imo) {
        if (existeImovel(code)) return false;
        imoveis.put(code, imo);
        
        return true;
    }

    @Override
    public Imovel retiraImovel(String code) {
        return imoveis.remove(code);
    }

    @Override
    public Iterator<String> iterator() {
        Set<String> returnVal = new HashSet<>();
        Iterator<String> it = imoveis.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            returnVal.add("Ref: " + key + " - " + imoveis.get(key));
        }
        return returnVal.iterator();
    }
    
    
    
}
