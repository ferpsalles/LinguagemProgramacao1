import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        pessoa objeto1 = new pessoa("Fernanda", "Ramos", 27, "Aluno");
        pessoa objeto12 = new pessoa("Gabriela", "Rodrigues", 19, "Aluno");
        pessoa objeto13 = new pessoa("Nathan", "Nascimento", 20, "Aluno");
        pessoa objeto14 = new pessoa("Vitor", "Silva", 20, "Aluno");
        pessoa objeto15 = new pessoa("Felipe", "Carvalho", 26, "Aluno");
        /* System.out.println(objeto1.getNome()+ " " + objeto1.getSobrenome() + " "+ objeto1.getIdade()); */

        lugar objeto2 = new lugar ("Cinemark", "SP", 999999, 8, 23);
        lugar objeto21 = new lugar ("McDonalds", "SP", 888888, 8, 23);
        lugar objeto22 = new lugar ("Subway", "SP", 777777, 8, 23);
        lugar objeto23 = new lugar ("Imaginarium", "SP", 666666, 8, 23);
        lugar objeto24 = new lugar ("Livraria Cultura", "SP", 555555, 8, 23);
        /*System.out.println (objeto2.getNome() + " " + objeto2.getLocalizacao() + " " + objeto2.getTelefone()); */

        AlunoFatecSJC objeto3 = new AlunoFatecSJC("Gabriel", "Salles", 1911293, 10);
        AlunoFatecSJC objeto31 = new AlunoFatecSJC("Fernanda", "Salles", 1598736, 9);
        AlunoFatecSJC objeto32 = new AlunoFatecSJC("Roberto", "Limão", 1614847, 0);
        AlunoFatecSJC objeto33 = new AlunoFatecSJC("Igor", "Oliveira", 14725836, 8);
        AlunoFatecSJC objeto34 = new AlunoFatecSJC("Pablo", "Vittar", 19164865, 7);
        /*System.out.println(objeto3.getNome() +" " + objeto3.getSobrenome() + " " + objeto3.getMatricula());*/

        InstrumentoMusical objeto4 = new InstrumentoMusical("Bateria", "CARLSBRO", 2800.0,0);
        InstrumentoMusical objeto41 = new InstrumentoMusical("Violão", "Tagima", 400.0,10.0);
        InstrumentoMusical objeto42 = new InstrumentoMusical("Piano", "Yamaha", 5000.0,20.0);
        InstrumentoMusical objeto43 = new InstrumentoMusical("Flauta", "Yamaha", 100.0,0);
        InstrumentoMusical objeto44 = new InstrumentoMusical("Baixo", "Gianinni", 2500.0,30.0);
        /*System.out.println(objeto4.getInstrumento() + " " + objeto4.getMarca() + " " + objeto4.getPreco());*/

        Profissional objeto5 = new Profissional("Paul", "McCartney", "Musico", 100000, 0);
        Profissional objeto51 = new Profissional("Freddie", "Mercury", "Musico", 0, 0);
        Profissional objeto52 = new Profissional("Axl", "Rose", "Musico", 50000, 0);
        Profissional objeto53 = new Profissional("Serj" , "Tankian", "Musico", 1000, 0);
        Profissional objeto54 = new Profissional("Chris", "Cornell", "Musico", 0, 0);
       /*System.out.println (objeto5.getNome() + " " + objeto5.getSobrenome() + " " + objeto5.getCargo());*/

        Calcado objeto6 = new Calcado("Chinelo", "Havainas", 50, 42);
        Calcado objeto61 = new Calcado("Pantufa", "Crocs", 70, 41);
        Calcado objeto62 = new Calcado("Tenis", "Adidas", 450, 42);
        Calcado objeto63 = new Calcado("Sapatilha", "Melissa", 150, 37);
        Calcado objeto64 = new Calcado("Bota", "Arezzo", 750, 35);
        /*System.out.println (objeto6.getCalcado() + " " + objeto6.getMarca() + " " + objeto6.getPreco());*/


         pessoa[] amigos = new pessoa [5];
         amigos[0] = objeto1;
         amigos[1]= objeto12;
         amigos[2]= objeto13;
         amigos[3] =objeto14;
         amigos[4] =objeto15;

         /*System.out.println (objeto1.getIdade());*/

        lugar [] shopping = new lugar [5];
        shopping[0]= objeto2;
        shopping[1]= objeto21;
        shopping[2]= objeto22;
        shopping[3]= objeto23;
        shopping[4]= objeto24;

        AlunoFatecSJC[] alunos = new AlunoFatecSJC[5];
        alunos [0] = objeto3;
        alunos [1] = objeto31;
        alunos [2] = objeto32;
        alunos [3] = objeto33;
        alunos [4] = objeto34;

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[5];

        instrumentos[0] = objeto4;
        instrumentos[1] = objeto41;
        instrumentos[2] = objeto42;
        instrumentos[3] = objeto43;
        instrumentos[4] = objeto44;

        Profissional[] musicos = new Profissional[5];
        musicos[0] = objeto5;
        musicos[1] = objeto51;
        musicos[2] = objeto52;
        musicos[3] = objeto53;
        musicos[4] = objeto54;

        Calcado[] calcados = new Calcado[5];

        calcados [0] = objeto6;
        calcados [1] = objeto61;
        calcados [2] = objeto62;
        calcados [3] = objeto63;
        calcados [4] = objeto64;





        sc.close();

    }
}
