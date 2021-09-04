package entidade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Animal {
    //definindo os atributos da classe Animal
    int idade;
    String nome;

    //definindo os métodos/comportamentos da classe Animal
    public void display(){ System.out.println("\nSou um: " + this.getClass().getSimpleName());}

    public void imprimirNome(){ System.out.println("Meu nome é: " + this.getNome());}

    public void imprimirIdade(){ System.out.println("Minha idade é: " + this.getIdade());}

    public void mover(){
        System.out.println("Não tenho movimento definido");
    }

    public void emitirSom(){ System.out.println("Não emito nenhum som"); }

}
