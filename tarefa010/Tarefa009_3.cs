using System;

namespace Tarefa009_3
{
    class Tarefa009_3
    {
        static void Main(string[] args)
        {
            double saldo, saldo_total;

            Console.WriteLine("Informe o saldo:");
            saldo= Convert.ToDouble(Console.ReadLine());

            saldo_total = saldo + (saldo * 0.15);
            Console.WriteLine("O saldo com reajuste é: " + saldo_total);

        }
    }
}
