using System;

namespace Tarefa009_1
{
    class Tarefa009_1
    {
        static void Main(string[] args)
        {
            int anos, meses, dias, total;

            Console.WriteLine("Informe a idade em anos:");
            anos = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Informe a idade em meses:");
            meses = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Informe a idade em dias:");
            dias = Convert.ToInt32(Console.ReadLine());

            total = (anos * 365) + (meses * 30) + dias;

            Console.WriteLine("A idade em dias eh: " + total + " dias");
                        
        }
    }
}
