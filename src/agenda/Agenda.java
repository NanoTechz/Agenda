package agenda;

import java.util.Vector;

public class Agenda {

    private Vector listaContatos;

    public Agenda() {
        this.listaContatos = new Vector();
    }

    public String adicionarContato(Contato contato) {
        listaContatos.add(contato);
        return "Contato adicionado com sucesso";
    }
}
