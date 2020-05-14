using System;

namespace arrayclass
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] Arr = new int[12] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 7 };
            Console.WriteLine("The first occurrence of 7 is at index" + Array.IndexOf(Arr, 7));
            Console.WriteLine("the last occurrence of 7 is at index" + Array.LastIndexOf(Arr, 7));
            int x = 0;
            while ((x = Array.IndexOf(Arr, 7, x)) > 0)
            {
                Console.WriteLine("7 found at index" + x);
                ++x;

            }
            x = Arr.Length - 1;
            while ((x = Array.LastIndexOf(Arr, 7, x)) > 0)
            {
                Console.WriteLine("7 found at index" + x);
                --x;

            }
            Console.WriteLine("Array that befor sorter");
            for (int i = 0; i <= Arr.Length; i++)
            {
                Console.WriteLine("{0} : {1}", i + 1, Arr[i]);
            }
            Array.Sort(Arr);
            Console.WriteLine("Array that after sorter");
            for (int i = 0; i <= Arr.Length; i++)
            {
                Console.WriteLine("{0} : {1}", i + 1, Arr[i]);
            }
            Array.Reverse(Arr);
            Console.WriteLine("Array that befor reverse");
            for (int i = 0; i <= Arr.Length; i++)
            {
                Console.WriteLine("{0} : {1}", i + 1, Arr[i]);
            }
            Console.ReadLine();
        }
    }
}
