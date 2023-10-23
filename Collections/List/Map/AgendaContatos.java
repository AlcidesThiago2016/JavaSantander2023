package Collections.List.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Thiago", 6666666);
        agendaContatos.adicionarContato("Thiago", 6585256);
        agendaContatos.adicionarContato("Thiago Bezerra", 5555555);
        agendaContatos.adicionarContato("Thiago Java", 6856985);
        agendaContatos.adicionarContato("Ricardo", 6666666);
        agendaContatos.adicionarContato("Thiago", 2222222);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ricardo");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Thiago Java"));
    }
}
