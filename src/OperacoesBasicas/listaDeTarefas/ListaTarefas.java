package OperacoesBasicas.listaDeTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removendoTarefa = new ArrayList<>();
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equals(descricao)){
                removendoTarefa.add(t);
            }
        }
        listaTarefas.removeAll(removendoTarefa);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTareas(){
        System.out.println(listaTarefas);
    }



    public static void main(String[] args){
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Numero total de elementos na lista e: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar JavaScript");

        System.out.println("Numero total de elementos na lista e: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Estudar JavaScript");

        System.out.println("Numero total de elementos na lista e: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTareas();
    }


}
