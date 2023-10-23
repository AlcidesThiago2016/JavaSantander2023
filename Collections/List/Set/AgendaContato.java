package Collections.List.Set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pequisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numeroNovo){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numeroNovo);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public int contarContatos(){
        return contatoSet.size();
    }

    public static void main(String[] args) {

        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        agendaContato.adicionarContatos("Thiago", 12345);
        agendaContato.adicionarContatos("Sergio", 56789);
        agendaContato.adicionarContatos("Ricardo", 765435);

        agendaContato.exibirContatos();
        System.out.println(agendaContato.contarContatos());

        agendaContato.adicionarContatos("Darci",98765);

        System.out.println(agendaContato.contarContatos());

    }


}