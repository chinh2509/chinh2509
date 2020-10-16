using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using filethi_01.Models;
using filethi_01.Services;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace filethi_01.Controllers
{
     [Route("api/[controller]")]
        [ApiController]
        public class ProductsController : ControllerBase
        {
            public ProductsController(JsonFileProductService productService)
            {

            }
            public JsonFileProductService ProductService { get; }
            [HttpGet]
            public IEnumerable<Models.Product> Get()
            {
                return ProductService.GetProducts();
            }
            [Route("Rate")]
            //[HttpPatch]
            [HttpGet]
            public ActionResult Get(
                [FromQuery] String ProductId,
                [FromQuery] int Rating)
            {
            object p = ProductService.AddRating(ProductId, Rating);
                return Ok();
            }
        }
    
}
