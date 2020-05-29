using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;

namespace baithi
{
    class test
    {
        static void Main(string[] args)
        {
            MobilePhone m1 = new MobilePhone(1,"chinh",12,"sach");
            Console.WriteLine("tien thue cua san pham la:" + m1.computeTax());
            Console.WriteLine( m1.ToString());

            book book = new book(2,"chinh2",123,"so dien thoai");
            Console.WriteLine(book.ToString());
            Console.WriteLine("tien thue cua sach la:" + book.computeTax());
            Console.ReadKey();
        }
    }
}