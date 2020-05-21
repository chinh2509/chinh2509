using lap_03.C;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Program
{
    class Program
    {
        public static void Main()
        {

            // khai báo một tham chiếu đối tượng xe có tên myCar.
            car myCar; 
            // tạo một đối tượng Xe và gán địa chỉ của nó cho myCar
            System.Console.WriteLine("Tạo một đối tượng Xe và gán " + "vị trí bộ nhớ của nó đến myCar");
            myCar = new car();
            // gán giá trị cho các trường của đối tượng Xe bằng myCar
            myCar.make = "Toyota";
            myCar.model = "MR2";
            myCar.color = "black";
            myCar.yearBuilt = 1995;
            //hiển thị các giá trị trường bằng myCar
            System.Console.WriteLine("myCar details:");
            System.Console.WriteLine("myCar.make = " + myCar.make);
            System.Console.WriteLine("myCar.model= " + myCar.model);
            System.Console.WriteLine("myCar.color = " + myCar.color);
            System.Console.WriteLine("myCar.yearBuilt=" + myCar.yearBuilt);
            // gọi các phương thức bằng myCar
            myCar.Start();
            myCar.Stop();
            // khai báo một tham chiếu đối tượng Car khác và
            // tạo một đối tượng Car khác
            System.Console.WriteLine("Tạo một đối tượng xe khác" + "gán vị trí bộ nhớ của nó cho redPogio");
            car redPorsche = new car();
            redPorsche.make = "Porsche";
            redPorsche.model = "Boxster";
            redPorsche.color = "red";
            redPorsche.yearBuilt = 2000;
            System.Console.WriteLine("redPorsche is a " + redPoSrsche.model);
            //thay đổi đối tượng được tham chiếu bởi đối tượng myCar 
            // tham chiếu đối tượng được tham chiếu bởi redPorshe
            System.Console.WriteLine("Chỉ định redPogio cho myCar");
            myCar = redPorsche;
            System.Console.WriteLine("myCar details:");
            System.Console.WriteLine("myCar.make = " + myCar.make);
            System.Console.WriteLine("myCar.model = " + myCar.model);
            System.Console.WriteLine("myCar.color = " + myCar.color);
            System.Console.WriteLine("myCar.yearBuilt = " + myCar.yearBuilt);
            // gán null cho myCar (myCar sẽ không còn tham chiếu )
            // một đối tượng)
            myCar = null;
            Console.ReadLine();
        }
    }
}
