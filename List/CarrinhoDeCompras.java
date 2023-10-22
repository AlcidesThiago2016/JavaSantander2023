package List;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> items;

    public CarrinhoDeCompras(){
        this.items = new ArrayList<>();
    }

    public void adicionarItens(String nome, Double preco, int quantidade){
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, Double preco, int quantidade){
        List<Item> itemAremover = new ArrayList<>();
        if (!items.isEmpty()){
            for (Item i : items) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemAremover.add(i);
                }
            }
            items.removeAll(itemAremover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    public void exibirItens(){
        if (!items.isEmpty()){
            System.out.println(this.items);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public Double calcularCarrinho(){
        Double total = 0d;
        if (!items.isEmpty()){
            for (Item item : items) {
                double valor = item.getPreco() * item.getQuantidade();
                total += valor;
            }
            return total;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
