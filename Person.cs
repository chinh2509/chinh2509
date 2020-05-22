using System;

namespace person
{
    public abstract class Person
    {
        protected String name;
        protected int phone;
        protected String email;
        public Person(String name , int phone , String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
            protected Person()
        {
            name = "chinh";
            phone = 123123123;
            email = "kutysomapc@gmail.com";
        }
        // Abstract method
        public abstract double CompateBonus();
        public abstract double CompateVacation();
    }
}
