/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.hoadon;

import java.util.Date;

/**
 *
 * @author doanm
 */
public class HoaDonHeader 
{
    String maHoaDon, tenKhachHang;
    Date ngayBan;
    
    public HoaDonHeader(Builder builder)
    {
        this.maHoaDon = builder.maHoaDon;
        this.ngayBan = builder.ngayBan;
        this.tenKhachHang = builder.tenKhachHang;
    }

    @Override
    public String toString() 
    {
        return "Mã hóa đơn: " + maHoaDon + "\n"
                + "Ngày bán: " + ngayBan + "\n"
                + "Tên khách hàng: " + tenKhachHang + "\n"
                + "-------------------------------------------------\n";
        
    }
    
    public static class Builder
    {
        String maHoaDon, tenKhachHang;
        Date ngayBan;

        public Builder() 
        {
        }
        
        public Builder addmaHoaDon(String maHoaDon)
        {
            this.maHoaDon = maHoaDon;
            return this;
        }
        
        public Builder addngayBan(Date ngayBan)
        {
            this.ngayBan = ngayBan;
            return this;
        }
        
        public Builder addtenKhachHang(String tenKhachHang)
        {
            this.tenKhachHang = tenKhachHang;
            return this;
        }
        
        public HoaDonHeader build()
        {
            return new HoaDonHeader(this);
        }
    }
}
