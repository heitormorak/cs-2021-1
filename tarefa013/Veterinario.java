package entidade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Veterinario {

    //recebe um animal e chama o método emitirSom daquele animal
    public static void examinar(Animal animal){
        animal.emitirSom();
    }

}
