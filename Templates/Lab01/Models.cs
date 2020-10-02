using System.Linq;
using Templates.Models;

namespace Lab01
{
    internal class Models
    {
        internal class ProductContext
        {
            public ProductContext()
            {
            }

            public IQueryable<Product> Products { get; internal set; }
        }
    }
}