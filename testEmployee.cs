using ex2;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lap_03.C
{
    class testEmployee
    {
        public static void main()
        {
            Employee em1 = new Employee();
            Employee em2 = new Employee();
       
            em1.Lastname = " trieu cao";
            em1.Firstname = "chinh";
            em1.Address = " ha dong ha noi";
            em1.sin = 12;
            em1.salary = 123.23;


            System.Console.WriteLine("thong tin nv1:");
            System.Console.WriteLine(em1.Lastname);
            System.Console.WriteLine(em1.Firstname);
            System.Console.WriteLine(em1.Address);
            System.Console.WriteLine(em1.sin);
            System.Console.WriteLine(em1.salary);
            em1.bonus();S
            System.Console.WriteLine("bonus nv1 la: {0}");

            Console.WriteLine("---------------------------------------:");
   
            em2.Lastname = " trieu cao";
            em2.Firstname = "hung";
            em2.Address = "dong hung thai binh";
            em2.sin = 15;
            em2.salary = 180.00;

            System.Console.WriteLine("thong tin nv2:");
            System.Console.WriteLine(em2.Lastname);
            System.Console.WriteLine(em2.Firstname);
            System.Console.WriteLine(em2.Address);
            System.Console.WriteLine(em2.sin);
            System.Console.WriteLine(em2.salary);
            em2.bonus();
            System.Console.WriteLine("bonus nv2 la: {0}");

            Console.ReadKey();
        }
    }
}
