using System;

namespace Tarefa009_6
{
    class Tarefa009_6
    {
        static void Main(string[] args)
        {
            int n;

            Console.WriteLine("Informe o numero:");
            n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine($"O antecessor de {n} é: {(n + 1)}");
            Console.WriteLine ($"O sucessor de {n} é: {(n - 1)}");
                     
        }
    }
}
