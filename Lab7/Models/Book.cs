using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab7.Models
{
    class Book
    {
        public int BookId{get ; set;}
        public String Title { get; set; }
        public String Author { get; set; }
        public String CoverImage { get; set; }
    }
    public class BookManager
    {
       

        internal static List<Book> GetBooks()
        {
            var books = new List<Book>();
            books.Add(new Book { BookId = 1, Title = "sách 1", Author = "TÁC GIẢ 1", CoverImage = "Assets/sach1.jpg" });
            books.Add(new Book { BookId = 2, Title = "sách 2", Author = "TÁC GIẢ 2", CoverImage = "Assets/sach2.jpg" });
            books.Add(new Book { BookId = 3, Title = "sách 3", Author = "TÁC GIẢ 3", CoverImage = "Assets/sach3.jpg" });
            books.Add(new Book { BookId = 4, Title = "sách 4", Author = "TÁC GIẢ 4", CoverImage = "Assets/sach4.jpg" });
            books.Add(new Book { BookId = 5, Title = "sách 5", Author = "TÁC GIẢ 5", CoverImage = "Assets/sach5.jpg" });
            books.Add(new Book { BookId = 6, Title = "sách 6", Author = "TÁC GIẢ 6", CoverImage = "Assets/sach6.jpg" });
            books.Add(new Book { BookId = 7, Title = "sách 7", Author = "TÁC GIẢ 7", CoverImage = "Assets/sach7.jpg" });
            books.Add(new Book { BookId = 8, Title = "sách 8", Author = "TÁC GIẢ 8", CoverImage = "Assets/sach8.jpg" });
            books.Add(new Book { BookId = 9, Title = "sách 9", Author = "TÁC GIẢ 9", CoverImage = "Assets/sach9.jpg" });
            return books;
        }
    }
}
