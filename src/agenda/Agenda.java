/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Vector;

/**
 *
 * @author alunos
 */
public class Agenda {
    private Vector listaContatos;

    public Agenda() {
        this.listaContatos = new Vector();
    }
    
    
    
    public String adicionarContato(Contato contato){
        listaContatos.add(contato);
       return "Contato adicionado com sucesso";
    }
}
