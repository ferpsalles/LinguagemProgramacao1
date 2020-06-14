package entities;

import java.util.Scanner;

public class agenciaBancaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        //Referencia para a classe pessoa

        pessoa objPessoa;

        String nome, sobrenome, cpf, conta;

        //Loop para repetir o menu
        do {
            exibirMenu();
            menu = sc.nextInt();

            switch(menu) {
                case 1: //Cadastro pessoa
                    System.out.println("Digite o nome: ");
                    nome = entradaString.nextLine();
                    System.out.println("Digite o sobrenome: ");
                    sobrenome = entradaString.nextLine();
                    System.out.println("Digite o cpf: ");
                    cpf = entradaString.nextLine();
                    System.out.println("Digite o número da conta: ");
                    conta = entradaString.nextLine();

                    //Cria objeto da classe
                    objPessoa = new pessoa (nome,sobrenome,cpf,conta);

                    //inserir no ArrayList
                    listaConta.adicionar(objPessoa);

                    break;

                case 2:
                    System.out.println("Listagem das Contas");
                    System.out.println(listaConta.listar());
                    break;
                case 3:
                    System.out.println("Remover conta");
                    System.out.println ("Digite o número da conta: ");
                    conta = entradaString.nextLine();

                    if ( ! (listaConta.getContatotal().isEmpty())) { //conta não vazia
                        if (listaConta.remover(conta)){
                            System.out.println ("Conta removida com sucesso!");
                        } else {
                            System.out.println ("Conta não encontrada!");
                        }
                    } else{
                        System.out.println ("Não apresenta contas cadastradas!");
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
        System.out.println("1- CADASTRAR CONTA");
        System.out.println("2- LISTAR CONTAS");
        System.out.println("3- REMOVER CONTA");
        System.out.println("4- SAIR");
        System.out.println("=====> Escolha uma opcao: ");
    }

}

