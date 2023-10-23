package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Uso do Consumer com expressão lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero ->{
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        //Uso do Consumer para imprimir numeros pares no Stream
        numeros.forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.println(n);
                    }
                }
            );
        }
    }
