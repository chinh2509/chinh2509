using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ex3_sesstion13
{
    class Employee
    {
        string empName;
        int empID;
        public Employee(string name, int num)
        {
            empName = name;
            empID = num;
        }
        public string Name
        {
            get
            {
                return empName;
            }
        }
        public int ID
        {
            get
            {
                return empID;
            }
        }
    }
    class GenericList<T> where T : Employee
    {
        T[] name = new T[3];
        int counter = 0;
        public void Add(T val)
        {
            name[counter] = val;
            counter++;
        }
        public void Display()
        {
            for (int i = 0; i < counter; i++)
            {
                Console.WriteLine(name[i].Name + ", " + name[i].ID);
            }
        }
    }
    class ClassConstraintDemo
    {
        static void Main(string[] args)
        {
            GenericList<Employee> objList = new
            GenericList<Employee>();
            objList.Add(new Employee("John", 100));
            objList.Add(new Employee("James", 200));
            objList.Add(new Employee("Patrich", 300));
            objList.Display();
        }
    }
}

