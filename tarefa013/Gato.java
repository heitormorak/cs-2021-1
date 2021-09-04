package entidade;

public class Gato extends Animal {

   @Override
    public void mover(){
        System.out.println("Eu ando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Eu posso miar");
    }
}
