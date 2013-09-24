/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author nanson
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
