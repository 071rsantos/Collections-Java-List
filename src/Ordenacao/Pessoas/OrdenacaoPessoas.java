package Ordenacao.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> ordenacaoPessoas;

    public OrdenacaoPessoas() {
        this.ordenacaoPessoas = new ArrayList<>();
    }
    
    public void adicionarPessoas(String nome, int idade, double altura){
        ordenacaoPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(ordenacaoPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }    

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(ordenacaoPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoas("Rodrigo", 38, 1.77);
        ordenacaoPessoas.adicionarPessoas("Melissa", 22, 1.61);
        ordenacaoPessoas.adicionarPessoas("Tamara", 46, 1.68);
    
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
    

}
