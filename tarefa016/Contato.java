package entidade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Contato {
    protected String nome;
    protected Integer telefone;
    protected String email;

    public Contato(String n, int i, String e) {
        this.nome=n;
        this.telefone=i;
        this.email=e;
    }



}
