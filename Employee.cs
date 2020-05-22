using person;
using System;

namespace ConsoleApp_lap05
{
    public class Employee : Person
    {
        private String part;
        private double salary;
        private DateTime dayOff;

        public Employee(string part, double salary)
        {
            this.part = part;
            this.salary = salary;
        }
        public override String ToString()
        {
            return "Employee is:" + ", name is " + name + ",phone is " + phone + ",part" + part + "salary" + salary +"day off:"+dayOff;
        }
        public override double CompateBonus() { return 0.06 * salary; }
        public override double CompateVacation()
        {
            return 0.12;
        }
    }
}