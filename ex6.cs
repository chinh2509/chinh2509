using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace EX3
{
    class Animal
    {
        protected string Food;
        protected string Activity;
    }
    class Cat : Animal
    {
        static void Main(string[] args)
        {
            Cat c1 = new Cat();
            c1.Food = "chih";
            c1.Activity = "hoàng";
            Console.WriteLine("The Cat loves to est" + c1.Food + ".");
            Console.WriteLine("The Catloves is" + c1.Activity + ".");
            Console.ReadKey();
        }
    }
}
