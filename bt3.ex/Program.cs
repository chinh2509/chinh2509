﻿using System;

namespace bt3.ex
{
    class Program
    {
        static void Main(string[] args)
        {
            int day;
            Console.Write("Enter day:");
            day = Convert.ToInt32(Console.ReadLine());
                switch (day)
                {
                    case 1:
                        Console.WriteLine("monday");
                        break;

                    case 2:
                        Console.WriteLine("tuesday");
                        break;

                    case 3:
                        Console.WriteLine("wednesday");
                        break;

                    case 4:
                        Console.WriteLine("thursday");
                        break;

                    case 5:
                        Console.WriteLine("friday");
                        break;

                    case 6:
                        Console.WriteLine("saturday");
                        break;

                    case 7:
                        Console.WriteLine("sunday");
                        break;
                }
            
        }
    }
}