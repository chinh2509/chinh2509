using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ex2_sesstion13
{
    class General<T>
    {
        T[] values;
        int counter = 0;
        public General(int max)
        {
            values = new T[max];
        }
        public void Add(T val)
        {
            if (counter < values.Length)
            {
                values[counter] = val;
                counter++;
            }    
        }
        public void Display()
        {
            Console.WriteLine("Constructed Class is of type :" + typeof(T));
            Console.WriteLine("Values strored in the object of constructed class are:");
            for (int i=0;i < values.Length; i++)
            {
                Console.WriteLine(values[i]);
            }    
        }
        
    }    
    class Students
    {
        static void Main(string[] args)
        {
            General<string> objGen = new General<string>(3);
            objGen.Add("JOHN");
            objGen.Add("Patrick");
            objGen.Display();
            General<int> objGen2 = new General<int>(2);
            objGen2.Add(200);
            objGen2.Add(35);
            objGen2.Display();
            Console.ReadKey();
        }   
        
    }
    
    
}
