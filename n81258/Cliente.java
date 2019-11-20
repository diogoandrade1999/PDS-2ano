/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n81258;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author demo
 */
class Cliente {
    private final String nome;
    Set<String> allNews = new HashSet<>();
    Set<String> lastNews = new HashSet<>();
    
    Cliente(String nome) {
        this.nome = nome;
    }

    Iterable<String> lastNews() {
        return lastNews;
    }

    String getName() {
        return nome;
    }

    void sendNews(String string) {
        allNews.add(string);
        lastNews.add(string);
    }
    
}
