package search_algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BuscaReagentesFalsos {

    public static void main(String[] args) {
        ArrayList<String> corTestes = new ArrayList<String>();
        ArrayList<Boolean> verificacoesTestes = new ArrayList<Boolean>();
        ArrayList<Integer> testesDescartados = new ArrayList<Integer>();

        corTestes.add("Verde");corTestes.add("Verde");corTestes.add("Vermelho");
        corTestes.add("Verde");corTestes.add("Verde");corTestes.add("Verde");
        corTestes.add("Verde");corTestes.add("Verde");corTestes.add("Vermelho");
        corTestes.add("Verde");corTestes.add("Verde");corTestes.add("Verde");

        for (String corTeste : corTestes) {
            if (corTeste.equals("Verde")) {
                verificacoesTestes.add(true);
            } else if (corTeste.equals("Vermelho")) {
                verificacoesTestes.add(false);
            }
        }

        for (int i = 0; i < verificacoesTestes.size(); i++){
            if (verificacoesTestes.get(i)) {
                continue;
            }
            testesDescartados.add(i);
        }
        System.out.println("Testes Descartados: " + testesDescartados);
    }
}
