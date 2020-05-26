using System;
using System.Security.Cryptography.X509Certificates;

namespace Animals
{
    class Animal
    {
        public void Eat()
        {
            Console.WriteLine(“Every animal eats something.”);
        }
    }
    class Mammal : Animal
    {
        public void Feature()
        {
            Console.WriteLine(“Mammals give birth to young ones.”);
        }
    }
}
