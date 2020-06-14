package application;

import java.util.Scanner;

public class concessionaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        //Referencia para a classe Carro
        carro objCarro;

        String marca, modelo, ano, preco;

        //Loop para repetir o menu de opçoes na tela
        do {
            exibirMenu();
            menu = entrada.nextInt();

            switch(menu) {
                case 1: //Cadastro do Carro
                    System.out.println("Digite a marca: ");
                    marca = entradaString.nextLine();
                    System.out.println("Digite o modelo: ");
                    modelo = entradaString.nextLine();
                    System.out.println("Digite o ano: ");
                    ano = entradaString.nextLine();
                    System.out.println("Digite o preco: ");
                    preco = entradaString.nextLine();

                    //Cria objeto da classe
                    objCarro = new carro(marca, modelo, ano, preco);

                    //inserir no ArrayList
                    lista.adicionar(objCarro);

                    break;

                case 2:
                    System.out.println("======> Listagem de Carros");
                    System.out.println(lista.listar());
                    break;
                case 3:
                    System.out.println("======> Pesquisar pela marca");
                    System.out.println("Digite a marca: ");
                    marca = entradaString.nextLine();
                    System.out.println("Existem " + lista.pesquisar(marca) + " carro(s) da marca " + marca);
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
        System.out.println("1- CADASTRAR");
        System.out.println("2- LISTAR");
        System.out.println("3- PESQUISAR POR MARCA");
        System.out.println("4- SAIR");
        System.out.println("=====> Escolha uma opcao: ");
    }

}
