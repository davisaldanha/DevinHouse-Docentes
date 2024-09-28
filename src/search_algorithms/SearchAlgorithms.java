package search_algorithms;

import java.util.Scanner;

public class SearchAlgorithms {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] estante  = new String[] {"Livro 1", "Livro 2", "Livro 3", "Livro 4"};
        String livroProcurar = "";

        System.out.println("Qual livro quer achar?");
        livroProcurar = scan.nextLine();
        int resultado = searchLivro(estante, livroProcurar);

        System.out.println(
                resultado == -1 ?
                        "Livro não encontrado" : "Livro encontrado na posição " + resultado);

    }

    public static int searchLivro(String[] array, String value){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
