package entidade;

public class TesteZoologico {
    public static void main(String[] args) {
        int n = 10;

        //criando array Jaula de tamanho 10
        Animal[] jaulas = new Animal[n];

        //preenchendo vetor com animais diferentes
        Animal c = new Cachorro("Cao 1", 3);
        jaulas[0]= c;

        Animal cav = new Cavalo("Cav 1", 2);
        jaulas[1] = cav;

        Animal p = new Preguica("Preg 1", 3);
        jaulas[2] = p;

        Animal c1 = new Cachorro("Cao 2", 3);
        jaulas[3]= c1;

        Animal cav1 = new Cavalo("Cav 2", 4);
        jaulas[4] = cav1;

        Animal p1 = new Preguica("Preg 2", 6);
        jaulas[5] = p1;

        Animal c2 = new Cachorro("Cao 3", 10);
        jaulas[6]= c2;

        Animal cav2 = new Cavalo("Cav 3", 9);
        jaulas[7] = cav2;

        Animal p2 = new Preguica("Preg 3", 7);
        jaulas[8] = p2;

        Animal c3 = new Cachorro("Cao 4", 5);
        jaulas[9]= c3;


        //percorrendo o vetor
        for (int i=0;i<n;i++){
            jaulas[i].emitirSom();
        }

    }

}
