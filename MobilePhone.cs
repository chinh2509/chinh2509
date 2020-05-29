using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace baithi
{
    class MobilePhone:Prodduct
    {
        public MobilePhone(int _id, string _name, double _price, string _producer)
             : base(_id, _name, _price, _producer)
        { }
           
        

        public override double computeTax()
        {
            return getPrice() * 10 / 100;
        }
     
    }
}
