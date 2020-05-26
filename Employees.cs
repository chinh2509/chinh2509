using System;

namespace Employee02
{
    class Employees
    {
        int _empld = 1;
        string _empName = "JamesAnderson";
        int _age = 25;
        public void Display()
        {
            Console.WriteLine("EmployeeID:" + _empld);
            Console.WriteLine("EmployeeName:" + _empName);
        }
    }
    class Department : Employees
    {

        int _deptId = 501;
        string _deptName = "Sales";
        new void Display()
        {
            base.Display();
            Console.WriteLine("DepartmentID:" + _deptId);
            Console.WriteLine("DepartmentName:" + _deptName);
        }

        static void Main(string[] args)
        {
            Department d1 = new Department();
            d1.Display();
            Console.ReadKey();
        }

    }
    
}
