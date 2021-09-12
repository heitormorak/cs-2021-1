package entidade;

public class AnimalTeste {
    public static void main(String[] args) {

        //instanciando o animal c, que é um cachorro
        Animal c = new Cachorro("Bilu", 5);
        c.display();
        c.imprimirNome();
        c.imprimirIdade();
        c.emitirSom();
        c.mover();

        //instanciando o animal cav, que é um cavalo
        Animal cav = new Cavalo("Trovao", 4);
        cav.display();
        cav.imprimirNome();
        cav.imprimirIdade();
        cav.emitirSom();
        cav.mover();

        //instanciando um animal p, que é uma preguiça
        Animal p = new Preguica("Preg", 2);
        p.display();
        p.imprimirNome();
        p.imprimirIdade();
        p.emitirSom();
        p.mover();


    }
}
