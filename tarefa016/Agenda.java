package entidade;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    //inserindo contatos
    public void inserir(Contato c){
        contatos.add(c);
    }

    //excluindo contatos
    public void excluir(Contato c){
        contatos.clear();
    }

    //buscando contatos
    public void buscar(String nome) throws ContatoNaoEncontradoException {
        //percorre a lista de acordo com seu tamanho e compara o nome
        for(int i=0;i<contatos.size();i++){
            Contato c = contatos.get(i);
            //if(c.getNome().equals(nome))
            if(c.getNome().equalsIgnoreCase(nome))
                System.out.println("está na lista");
            else{
                throw new ContatoNaoEncontradoException("Contato não encontrado!");
            }
        }

    }

}
