package entidade;

public class AnimalTeste {
    public static void main(String[] args) {

        //instanciando o animal c, que é um cachorro
        Animal c = new Cachorro();
        c.display();
        c.setNome("Bilu");
        c.setIdade(5);
        c.imprimirNome();
        c.imprimirIdade();
        c.emitirSom();
        c.mover();

        //instanciando o animal cav, que é um cavalo
        Animal cav = new Cavalo();
        cav.display();
        cav.setNome("Trovão");
        cav.setIdade(9);
        cav.imprimirNome();
        cav.imprimirIdade();
        cav.emitirSom();
        cav.mover();

        //instanciando um animal p, que é uma preguiça
        Animal p = new Preguica();
        p.display();
        p.setNome("Preg");
        p.setIdade(2);
        p.imprimirNome();
        p.imprimirIdade();
        p.emitirSom();
        p.mover();


    }
}
