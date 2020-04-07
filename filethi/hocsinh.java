package filethi;

public class hocsinh {
    private String name;
    private String address;
    private String phone;

    public hocsinh(String name,String address,String phone){
        this.name=name;
        this.address=address;
        this.phone=phone;

    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public void setAddress(){
        this.address=address;
    }
    public void setPhone(){
        this.phone=phone;
    }
    @Override
    public String toString() {
        return "hocsinh{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

}
