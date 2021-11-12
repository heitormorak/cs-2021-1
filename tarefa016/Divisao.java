package entidade;

import java.util.Scanner;

public class Divisao{
    private static Scanner sc = new Scanner(System.in);

    public static int divide(int dividendo, int divisor) throws ArithmeticException{

        //numa divisão, um erro aritmético seria dividir por 0, pois não existe divisão por 0
        if(divisor==0) {
            throw new ArithmeticException("Nao existe divisao por 0");
        }
        else {
            return dividendo / divisor;
        }
    }

    public static void main (String args[]) {

        System.out.println("Informe o valor do dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Informe o valor do divisor: ");
        int divisor = sc.nextInt();
        System.out.println(divide(dividendo, divisor));
    }
}
