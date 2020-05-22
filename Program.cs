using ConsoleApp_lap05;
using System;

namespace ConsoleApp5
{
    public class Program
    {
        static void Main(string[] args)
        {
            Employee c1 = new Employee("chinh", 123);
            Console.WriteLine("employee before change: " + c1.ToString());
            //using properties
            Student a1 = new Student("sinh viên");
            Console.WriteLine("employee before change: " + a1.ToString());
            //using properties
            Console.ReadLine();
        }
    }
}
