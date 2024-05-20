package Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> catalogoLivros;

    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String tituolo, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(tituolo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {   
            for (Livro livro : catalogoLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(livro);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervalo = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livro livro : catalogoLivros) {
                if (livro.getAnoPublicacao()>= anoInicial && livro.getAnoPublicacao()<=anoFinal) {
                    livroPorIntervalo.add(livro);
                }
            }
        }
        return livroPorIntervalo;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!catalogoLivros.isEmpty()){
            for ( Livro livro : catalogoLivros) {
                if (livro.getTitulo().equals(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("A culpa é das estrelas", "John Green", 2010);
        catalogoLivros.adicionarLivro("Cidade de papel", "John Green", 2008);
        catalogoLivros.adicionarLivro("Harry Potter", "JK Rolling", 2007);

        System.out.println(catalogoLivros.pesquisaPorAutor("John Green"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2008, 2010));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Harry Potter"));

    }

}