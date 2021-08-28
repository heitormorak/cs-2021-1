using System;

namespace Tarefa009_4
{
    class Tarefa009_4
    {
        static void Main(string[] args)
        {
            double IPI, valor_peca1, valor_peca2, total, total_IPI;
            int peca1, peca2, qtd_peca1, qtd_peca2;

            Console.WriteLine("Informe o IPI a ser acrescido:");
            IPI = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Informe o codigo da peca 1:");
            peca1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Informe o valor unitario da peca 1:");
            valor_peca1 = Convert.ToDouble(Console.ReadLine()); 

            Console.WriteLine("Informe a quantidade de pecas 1:");
            qtd_peca1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Informe o codigo da peca 2:");
            peca2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Informe o valor unitario da peca 2:");
            valor_peca2 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Informe a quantidade de pecas 2:");
            qtd_peca2 = Convert.ToInt32(Console.ReadLine());

            total_IPI = (IPI / 100);
            total = ((valor_peca1 + valor_peca1 * total_IPI) * qtd_peca1) + (valor_peca2 + valor_peca2 * total_IPI) * qtd_peca2;

            Console.WriteLine("O total a ser pago é: " + total);
        }
    }
}
