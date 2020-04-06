package Java2_08;

public class book {
    private String bookname;
    private double price;
    private int qty;

    public book(String bookname,double price,int qty){


        this.bookname = bookname;
        this.price = price;
        this.qty = qty;
    }


    public String getName() {
        return bookname;
    }

    public void setName(String bookname) {
        this.bookname = bookname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Gift{" +
                ", name='" + bookname + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
