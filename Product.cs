using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace baithi
{
    public abstract class Prodduct
    {
        private int id;
        private string name;
        private double price;
        private string producer;
        public Prodduct() { }

        public Prodduct(int id, string name, double price, string produce)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.producer = producer;
       

        }

        public int ID
        {
            get { return id; }
            set { id = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public double Price
        {
            get { return price; }
            set { price = value; }
        }
        public string Producer
        {
            get { return producer; }
            set { producer = value; }
        }


        public int getID()
        {
            return this.id;
        }

        public string getName()
        {
            return this.name;
        }

        public double getPrice()
        {
            return this.price;
        }

        public string getProducer()
        {
            return this.producer;
        }

    
        public abstract double computeTax();

      
        public override string ToString()
        {
            return "id: " + this.id + ", name: " + this.name + ", price: " + this.price + ", producer:  " + this.producer;
        }
    }
}
