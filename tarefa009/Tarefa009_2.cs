using System;

namespace Tarefa009_2
{
    class Tarefa009_2
    {
        static void Main(string[] args)
        {
                int media_1;
                int media_2;
                int soma_medias;
                int media_medias;

                media_1 = (8 + 9 + 7) / 3;
                Console.WriteLine("A media artimetica dos numeros 8,9 e 7 é: " + media_1);

                media_2 = (4 + 5 + 6) / 3;
                Console.WriteLine("A media artimetica dos numeros 4,5 e 6 é: " + media_2);

                soma_medias = media_1 + media_2;
                Console.WriteLine("A soma das duas medias é: " + soma_medias);

                media_medias = soma_medias / 2;
                Console.WriteLine("A media das medias é: " + media_medias);
            }
    }
}
