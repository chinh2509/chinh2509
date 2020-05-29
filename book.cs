using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.Linq;
using System.Text;

namespace baithi
{
    class book : Prodduct
    {
        public Book(int _id, string _name, double _price, string _producer)
          : base(_id, _name, _price, _producer)
        {

        }

        public override double computeTax()
        {
            return getPrice() *0.08;
        }

    }
}
