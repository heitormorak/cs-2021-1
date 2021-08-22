using System;

namespace Tarefa009_5
{
    class Tarefa009_5
    {
        static void Main(string[] args)
        {
            double sm, su, qtd;

            Console.WriteLine("Informe o salario minimo:");
            sm = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Informe o salario do usuario:");
            su = Convert.ToDouble(Console.ReadLine());

            qtd = su / sm;
            Console.WriteLine("O usuario ganha " + Math.Round(qtd, 2) + " salarios minimos");
        }
    }
}
