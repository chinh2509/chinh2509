using System;

namespace bt4
{
    class Program
    {
        static void Main(string[] args)
        {
            int N,boi;
            Console.Write("Enter day:");
            N = Convert.ToInt32(Console.ReadLine());
             for(int i = 0; i <= 9; i++)
            {
                boi = N * i;
                Console.WriteLine("bội sô của N là:" + boi);

            }
        }
    }
}
