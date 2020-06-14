package entities;

import application.carro;

import java.util.ArrayList;

public class listaConta {
    private static ArrayList<pessoa> contatotal = new ArrayList<>();

    public static ArrayList <pessoa> getContatotal(){
        return contatotal;
    }

    // adicionar conta
    static public void adicionar (pessoa l){
        contatotal.add(l);
    }

    // listar todos os objetos da lista
    public static String listar() {
        String saida = "";
        int i = 1;
        for(pessoa l : contatotal) {
            saida += "\n Conta nº: " + (i++) + "\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }

    //remover contas
    static public boolean remover (String conta){
        for (pessoa l : contatotal){
            if ( l.getConta().equalsIgnoreCase(conta)){
                contatotal.remove(l);
                return true;
            }
        }

        return false;
    }
}
