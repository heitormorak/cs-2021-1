package entidade;

//para criar as caixas de diálogo
import javax.swing.JOptionPane;

public class TesteZoologico {
    public static void main(String[] args) {
        int n = 10;

        //criando array Jaula de tamanho 10
        Animal[] jaulas = new Animal[n];

        //lendo os dados de entrada do array Jaula
        for(int i= 0;i<n;i++){
            String nome= JOptionPane.showInputDialog("Digite o animal:");
            if(nome.equalsIgnoreCase("cachorro")){
                jaulas[i]=Cachorro;
            }
        }

    }

}
