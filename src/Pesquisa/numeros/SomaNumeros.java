package Pesquisa.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> somaNumeros;

    public SomaNumeros(){
        this.somaNumeros = new ArrayList<>();
    }

    public void adicionaNumero(int numero){
        somaNumeros.add(numero);
    }

    public int calculaSoma(){
        int soma = 0;
        for (Integer i : somaNumeros) {
            soma+=i;
        }
        return soma;
    }

    public int encontraMaiorNumero(){
        int maior = 0;
        for (Integer i : somaNumeros) {
            if(i >= maior){
                maior = i;
            }
        }
        return maior;
    }

    public int encontraMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for (Integer i : somaNumeros) {
            if (i < menor) {
                menor = i;
            }
        }

        return menor;
    }

    public void exibrNumeros(){
        System.out.println(somaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionaNumero(7);
        somaNumeros.adicionaNumero(8);
        somaNumeros.adicionaNumero(10);
        somaNumeros.adicionaNumero(1);
        somaNumeros.adicionaNumero(20);
        somaNumeros.adicionaNumero(5);

        System.out.println(somaNumeros.calculaSoma());
        System.out.println(somaNumeros.encontraMaiorNumero());
        System.out.println(somaNumeros.encontraMenorNumero());
        somaNumeros.exibrNumeros();
    }

}
