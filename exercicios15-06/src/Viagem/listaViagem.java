package Viagem;

import java.util.ArrayList;

public class listaViagem {

        private static ArrayList<pessoaViagem> destinototal = new ArrayList<>();

        public static ArrayList <pessoaViagem> getContatotal(){

            return destinototal;
        }

        // adicionar conta
        static public void adicionar (pessoaViagem l){
            destinototal.add(l);
        }

        // listar todos os objetos da lista
        public static String listar() {
            String saida = "";
            int i = 1;
            for(pessoaViagem l : destinototal) {
                saida += "\n Destinos: " + (i++) + "\n";
                saida += l.imprimir() + "\n";
            }
            return saida;
        }

        //remover contas
        static public boolean remover (String destino){
            for (pessoaViagem l : destinototal){
                if ( l.getDestino().equalsIgnoreCase(destino)){
                    destinototal.remove(l);
                    return true;
                }
            }

            return false;
        }
}

