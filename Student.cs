using person;
using System;

namespace ConsoleApp5
{
    public class Student : Person
    {
        private String course;
        private double Salary;
        public Student(String course)
        {
            this.course = course;
        }
        
        public override String ToString()
        {
            return "Student is:" + ", name is " + name + ",phone is " + phone + ",course" + course + "email" + email;
        }
        public override double CompateBonus()
        {
            return Salary * 0.05 + 1000;
        }
        public override double CompateVacation()
        {
            throw new NotImplementedException();
        }
    }
}
