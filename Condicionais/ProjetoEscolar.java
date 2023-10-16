package Condicionais;

public class ProjetoEscolar {
    public static void main(String[] args) {

        double nota = 6.0;

        if ( nota >= 7.0){
            System.out.println("Aprovado");
        } else if ( nota >= 5 && nota < 7) {
            System.out.println("Prova de Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
