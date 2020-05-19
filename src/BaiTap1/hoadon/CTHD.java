/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.hoadon;

/**
 *
 * @author doanm
 */
public class CTHD 
{
    String sanPham;
    int soLuong, chietKhau;
    double donGia;
    
    public CTHD (Builder builder)
    {
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() 
    {
        return "Tên sản phầm: " + sanPham + "\n"
                + "Số lượng: " + soLuong + "\n"
                + "Đơn giá: " + donGia + "\n"
                + "Chiết khấu: " + chietKhau + "%\n"
                + "---------------------------------------------\n";
    } 
                  
    public static class Builder
    {
        String sanPham;
        int soLuong, chietKhau;
        double donGia;

        public Builder() {
        }
        
        public Builder addsanPham(String sanPham)
        {
            this.sanPham = sanPham;
            return this;
        }
        
        public Builder addsoLuong(int soLuong)
        {
            this.soLuong = soLuong;
            return this;
        }
        
        public Builder adddonGia(double donGia)
        {
            this.donGia = donGia;
            return this;
        } 
        
        public Builder addchietKhau(int chietKhau)
        {
            this.chietKhau = chietKhau;
            return this;
        }
        
        public CTHD build()
        {
            return new CTHD(this);
        }
    }
}
