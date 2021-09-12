package entidade;

import java.util.ArrayList;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico(int n){
        this.jaulas = new Animal[n];
    }
    public Zoologico(){
        this.jaulas= new Animal[10];
    }
}
