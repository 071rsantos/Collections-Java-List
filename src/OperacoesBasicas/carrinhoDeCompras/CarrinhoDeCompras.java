package OperacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompra;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qnt){
        carrinhoDeCompra.add(new Item(nome, preco, qnt));
    }

    public void removerItem(String nome){
        List<Item> removendoItem = new ArrayList<>();
        for (Item item : carrinhoDeCompra) {
            if(item.getNome().equals(nome)){
                removendoItem.add(item);
            }
        }
        carrinhoDeCompra.removeAll(removendoItem);
    }

    public double valorTotalCarrinho(){
        double soma = 0;
        for (Item item : carrinhoDeCompra) {
            soma+=(item.getPreco()*item.getQnt());
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompra);
    }



    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDecompras = new CarrinhoDeCompras();

        carrinhoDecompras.adicionarItem("Monitor", 890, 1);
        carrinhoDecompras.adicionarItem("Gabinete", 180, 1);
        carrinhoDecompras.adicionarItem("Mouse", 50, 2);

        System.out.println("O valor total do carrrinho de compras e de: R$ "+carrinhoDecompras.valorTotalCarrinho());

        carrinhoDecompras.removerItem("Mouse");
        System.out.println("O valor total do carrrinho de compras e de: R$ "+carrinhoDecompras.valorTotalCarrinho());

        carrinhoDecompras.exibirItens();
    }

}
