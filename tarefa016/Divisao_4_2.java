package entidade;

import java.util.Scanner;

public class Divisao_4_2 {
    private static Scanner sc = new Scanner(System.in);

    public static int dividir(int dividendo, int divisor){
            return dividendo/divisor;
    }

    public static void main (String args[]) {

        System.out.println("Informe o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Informe o divisor: ");
        int divisor = sc.nextInt();

        //tentará ser executado
        try
        {
            dividir(dividendo, divisor);
        }

        //se nao for possível executar, catch trata a exceção aritmética
        catch (ArithmeticException e){
            //imprime a mensagem
            System.out.println(e.getMessage());
            //imprime a pilha
            e.printStackTrace();
        }
    }
}

