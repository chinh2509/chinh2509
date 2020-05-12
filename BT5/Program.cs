using System;

namespace BT5
{
    namespace Exercise5
    {
        class Exercise5
        {
            static void Main(string[] args)
            {
                double n = 1;
                for (int i = 1; i <= 20; i++)
                {
                    n = n * i;
                    Console.WriteLine("{0}! = {1}", i, n);
                }
            }
        }
    }
}
