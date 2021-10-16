package tarefa019;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;

//Getter e Setter Lombok
@Getter
@Setter

//Para essa solução foram criados em um só arquivo os métodos
//solicitados e a main para testa-los

//declarando a classe usuario e seus atributos nome, senha e cpf
public class Validacao {
    String nome;
    String senha;
    String cpf;

    //metodo que valida o nome, que deve ter entre 5 e 100 caracteres
    //e nao conter caractere especial
    public boolean validaNome(String nome){
        //Pattern pattern = Pattern.compile();
        return nome.matches("[a-z]{5,100}");
    }

    //metodo que valida a senha, que deve ter pelo menos 8 caracteres de
    //qualquer natureza, exceto espaço em branco
    public boolean validaSenha(String senha) {
        return senha.matches("(?=\\S+$).{8,}");
    }

    //metodo que valida o cpf, de acordo com as regras da RF
    public boolean validaCPF(String cpf){
        //se o cpf for uma sequencia de numeros iguais ou tiver tamanho
        //diferente de 11, então é inválido, retornando falso
        if (cpf.equals("00000000000") ||
                cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                (cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        //por ser do tipo string, precisamos converter os caracteres para int
        //e entao fazer as comparações


        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }


    public static void main(String[] args) {
        //criando um usuario a
        Validacao a = new Validacao();

        //informando nome e chamando o metodo que valida o nome
        a.setNome("heitor");
        System.out.println(a.validaNome(a.getNome()));

        //informando cpf e chamando o metodo que valida o cpf
        a.setCpf("04874266142");
        System.out.println(a.validaCPF(a.getCpf()));

        //informando senha e chamando o metodo que valida a senha
        a.setSenha("K%ki8jfokh");
        System.out.println(a.validaSenha(a.getSenha()));
    }
}
