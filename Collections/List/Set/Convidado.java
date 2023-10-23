package Collections.List.Set;

public class Convidado {

    private String nome;
    private int codigoconvite;

    public Convidado(String nome, int codigoconvite) {
        this.nome = nome;
        this.codigoconvite = codigoconvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoconvite() {
        return codigoconvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoconvite=" + codigoconvite +
                '}';
    }
}
