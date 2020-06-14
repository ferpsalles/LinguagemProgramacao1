package Viagem;

import java.util.Scanner;

public class destinoViagem {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Scanner entradaString = new Scanner(System.in);

            int menu;
            //Referencia para a classe pessoa

            pessoaViagem objPessoaViagem;

            String nome, cpf, destino;

            //Loop para repetir o menu
            do {
                exibirMenu();
                menu = sc.nextInt();

                switch(menu) {
                    case 1: //Cadastro pessoa
                        System.out.println("Digite o nome: ");
                        nome = entradaString.nextLine();
                        System.out.println("Digite o cpf: ");
                        cpf = entradaString.nextLine();
                        System.out.println("Digite o destino: ");
                        destino = entradaString.nextLine();

                        //Cria objeto da classe
                        objPessoaViagem = new pessoaViagem (nome,cpf,destino);

                        //inserir no ArrayList
                        listaViagem.adicionar(objPessoaViagem);

                        break;

                    case 2:
                        System.out.println("Listagem Destinos");
                        System.out.println(listaViagem.listar());
                        break;
                    case 3:
                        System.out.println("Remover Destinos");
                        System.out.println ("Digite o destino: ");
                        destino = entradaString.nextLine();

                        if ( ! (listaViagem.getContatotal().isEmpty())) { //conta não vazia
                            if (listaViagem.remover(destino)){
                                System.out.println ("Destino removido com sucesso!");
                            } else {
                                System.out.println ("Destino não encontrada!");
                            }
                        } else{
                            System.out.println ("Não apresenta destino cadastrados!");
                        }
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opcao do menu invalida");
                }

            } while(menu != 4);

        } // fim main

        static void exibirMenu() {
            System.out.println("================== MENU ================");
            System.out.println("1- CADASTRAR DESTINO");
            System.out.println("2- LISTAR DESTINO");
            System.out.println("3- REMOVER DESTINO");
            System.out.println("4- SAIR");
            System.out.println("=====> Escolha uma opcao: ");
        }

}

