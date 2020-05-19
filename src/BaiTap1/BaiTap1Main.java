/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import BaiTap1.hoadon.CTHD;
import BaiTap1.hoadon.HoaDon;
import BaiTap1.hoadon.HoaDonHeader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author doanm
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException
    {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        HoaDonHeader hdh = new HoaDonHeader.Builder()
                .addmaHoaDon("HD001")
                .addngayBan(sdf.parse("05/04/2000"))
                .addtenKhachHang("Trần Đức Lương")
                .build();
        
        CTHD ct1 = new CTHD.Builder()
                .addsanPham("Quạt gió")
                .addsoLuong(1)
                .adddonGia(15000000)
                .addchietKhau(10)
                .build();
        
        CTHD ct2 = new CTHD.Builder()
                .addsanPham("Máy lạnh")
                .addsoLuong(1)
                .adddonGia(11000000)
                .addchietKhau(20)
                .build();
        
        CTHD ct3 = new CTHD.Builder()
                .addsanPham("Tivi")
                .addsoLuong(20)
                .adddonGia(10000)
                .addchietKhau(5)
                .build();
        
        HoaDon hd = new HoaDon.Builder()
                .addHoaDonHeader(hdh)
                .addCTHD(ct1)
                .addCTHD(ct2)
                .addCTHD(ct3)
                .build();
        
        System.out.println(hd.toString());
    }
    
}
