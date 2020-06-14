package application;
import application.carro;

import java.util.ArrayList;

public class lista {
    private static ArrayList<carro> listaCarros = new ArrayList<>();

    //metodo GET
    public static ArrayList<carro> getListaCarros() {

        return listaCarros;
    }

    //Adiciona objeto na lista
    public static void adicionar(carro l) {

        listaCarros.add(l);
    }

    //Lista os dados de todos os objetos da lista
    public static String listar() {
        String saida = "";
        int i = 1;
        for(carro l : listaCarros) {
            saida += "\n========== Carro n " + (i++) + " ========\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }

    //pesquisa por marca
    public static int pesquisar(String marca) {
        int qtd = 0;

        for(carro l : listaCarros) {
            if(l.getMarca().equalsIgnoreCase(marca)) {
                qtd++;
            }
        }

        return qtd;
    }

}
