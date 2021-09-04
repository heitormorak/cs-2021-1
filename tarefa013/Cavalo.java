package entidade;

public class Cavalo extends Animal {

    //sobrepondo os métodos da classe Animal
    @Override
    public void emitirSom(){
        System.out.println("Eu posso relinchar");
    }

    @Override
    public void mover(){
        System.out.println("Eu corro");
    }

}

