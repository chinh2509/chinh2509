using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Threading.Tasks;

namespace filethi_01.Models
{
    public class Product
    {
        public String Id { get; set; }
        public String Name { get; set; }
        [JsonPropertyName("Img")]
        public String Image { get; set; }
        public String Price { get; set; }
        public int[] Ratings { get; set; }

        public override String ToString() => JsonSerializer.Serialize<Product>(this);
    }
}
