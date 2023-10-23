package List.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1,"Cafe", 5.90, 5);
        cadastroProdutos.adicionarProduto(2,"Manteiga", 9.90, 10);
        cadastroProdutos.adicionarProduto(3,"Leite", 7.99, 2);
        cadastroProdutos.adicionarProduto(1,"Banana", 5.82, 2);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("......");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("......");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
