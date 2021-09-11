package entidade;

import java.util.ArrayList;

public class AgendaTeste {
    public static void main(String[] args) {
        Agenda a;
        a=new Agenda();

        Contato primeiro;
        primeiro= new Contato("Heitor",999999,"heitor@ufg.br");

        Contato segundo;
        segundo = new Contato("Alan", 88888, "alan@ufg.br");

        a.inserir(new Contato("Gilmar", 3333333, "gilmar@ufg.br"));

        a.inserir(new Contato("Teste", 11111, "teste@ufg.br"));

        //pesquisar nome
        try {
            a.buscar("Andre");
        }
        catch (ContatoNaoEncontradoException cpie){
            System.out.println(cpie.getMessage());
            cpie.printStackTrace();
        }
    }
}
