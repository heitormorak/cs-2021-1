package entidade;

public class Preguica extends Animal {

    //sobrepondo os métodos da classe Animal
    @Override
    public void emitirSom(){
        System.out.println("Eu posso gritar");
    }

    @Override
    public void mover(){
        System.out.println("Eu subo em árvores");
    }

    public Preguica(String n, int i){
        this.nome=n;
        this.idade=i;
    }

}

