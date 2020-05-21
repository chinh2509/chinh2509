using System;

namespace ex2
{
    class Employee
    {
        public String Firstname;
        public String Lastname;
        public String Address;
        public long sin;
        public double salary;

        public Employee()
        {
        }

        public double bonus()
        {
            return salary * 12/100 ;S
        }
    }
}
