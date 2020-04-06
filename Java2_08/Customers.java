package Java2_08;

public class Customers {
    private String ten_kh;
    private String dia_chi;
    private String so_dt;

    public Customers(String ten_kh,String dia_chi,String so_dt){
        this.ten_kh = ten_kh;
        this.dia_chi = dia_chi;
        this.so_dt = so_dt;
    }

    public String getTen_kh() {
        return ten_kh;
    }

    public void setTen_kh(String ten_kh) {
        this.ten_kh = ten_kh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getSo_dt() {
        return so_dt;
    }

    public void setSo_dt(String so_dt) {
        this.so_dt = so_dt;
    }
}
