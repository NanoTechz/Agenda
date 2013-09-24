package agenda;

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
}
