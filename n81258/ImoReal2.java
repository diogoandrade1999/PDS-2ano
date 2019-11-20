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
public class ImoReal2 implements ImovelManager{
    String name;
    Map<String,Imovel> imoveis = new HashMap<>();
    Set<Cliente> clientes = new HashSet<>();

    public ImoReal2(String name) {
        this.name = name;
    }
    
    @Override
    public boolean existeImovel(String code) {
        return imoveis.containsKey(code);
    }

    @Override
    public boolean addImovel(String code, Imovel imo) {
        if (existeImovel(code)) return false;
        imoveis.put(code, imo);
        
        Iterator<Cliente> it = clientes.iterator();
        while(it.hasNext()){
            Cliente c = it.next();
            c.sendNews(name + " >> Novo ímovel: " + imo.type() + " " + imo.description());
        }
        
        return true;
    }

    @Override
    public Imovel retiraImovel(String code) {
        return imoveis.remove(code);
    }

    @Override
    public Iterator<String> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Cliente cliente) {
        clientes.add(cliente);
    }

    void remove(Cliente cliente) {
        clientes.remove(cliente);
    }
    
}
