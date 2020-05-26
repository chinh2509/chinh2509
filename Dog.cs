using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using thuake;

namespace Mammal
{
    class dog : Mammal { 


            public void Noise()
            {
                Console.WriteLine("Dog Barks.");
            }
            static void Main(String[] args)
            {
                dog d1 = new dog();
                d1.Eat();
                d1.Feature();
                d1.Noise();
            Console.ReadKey();
        }
      
       
    }
}
