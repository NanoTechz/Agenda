package agenda.modelo;

import agenda.modelo.Pessoa;
import java.util.Vector;

public class Agenda {

    private Vector listaContatos;

    public Agenda() {
        this.listaContatos = new Vector();
    }

    public String adicionarContato(Pessoa pessoa) {
        listaContatos.add(pessoa);
        return "Contato adicionado com sucesso";
    }

    public Vector getListaContatos() {
        return listaContatos;
    }
    
}
