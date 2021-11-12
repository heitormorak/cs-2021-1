package entidade;

public class Cachorro extends Animal {

    //sobrepondo os métodos da classe Animal
    @Override
    public void emitirSom(){
        System.out.println("Eu posso latir");
    }

    @Override
    public void mover(){
        System.out.println("Eu corro");
    }

    public Cachorro(String n, int i){
        this.nome=n;
        this.idade=i;
    }

}
