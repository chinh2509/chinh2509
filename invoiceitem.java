/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceItem;

/**
 *
 * @author Dell
 */
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
   
    
    public InvoiceItem(String id,String desc,int qty,double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    } 
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public Double getUnittPrice(Double UnitPrice){
        return unitPrice;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setUnitPrice(double Unitprice){
        this.unitPrice = Unitprice;
    }
    public double getTotal(){
        return unitPrice * qty;    
    }
    @Override
    public String toString(){
        return "InvoiceItem{" + "id=" + id + ", desc=" + desc + ", qty=" + qty + ",unitPrice="+ unitPrice +'}';
    }

    String getUnitPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
