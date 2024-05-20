package Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> ordenacaoNumeros;

    public OrdenacaoNumeros(){
        this.ordenacaoNumeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        this.ordenacaoNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(ordenacaoNumeros);
        if(!ordenacaoNumeros.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(ordenacaoNumeros);
        if (!ordenacaoNumeros.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }
        else{
            throw new RuntimeException("A Lista Está Vazia.");
        }
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumeros(7);
        ordenacaoNumeros.adicionarNumeros(10);
        ordenacaoNumeros.adicionarNumeros(5);
        ordenacaoNumeros.adicionarNumeros(3);
        ordenacaoNumeros.adicionarNumeros(6);
        ordenacaoNumeros.adicionarNumeros(90);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

}
