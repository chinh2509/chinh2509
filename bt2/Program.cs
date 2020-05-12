using System;

namespace bt2
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, num3;
            Console.Write("Enter num1: ");
            num1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter num2: ");
            num2 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter num3: ");
            num3 = Convert.ToInt32(Console.ReadLine());

            //     Console.WriteLine(num1);Console.WriteLine(num2);Console.WriteLine(num3);

            if (num1 > num2)
            {
                Console.Write("max = num1. \n\n");
            }
            else if (num2 > num3)
            {
                Console.Write("max = num2.\n\n");
            }
            else 
            {
                Console.Write("max = num3. \n\n");
            }
            Console.ReadKey();
        }
    }
}
