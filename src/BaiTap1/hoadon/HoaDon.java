/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.hoadon;

import java.util.ArrayList;

/**
 *
 * @author doanm
 */
public class HoaDon 
{
    HoaDonHeader hdh;
    ArrayList<CTHD> list = new ArrayList<>();
    
    public HoaDon(Builder builder)
    {
        this.hdh = builder.hdh;
        this.list = builder.list;
    }

    @Override
    public String toString() {
        String s = hdh.toString();
        for(int i = 0; i < list.size(); i++)
            s += list.get(i).toString();
        return s;
    }
    
    public static class Builder
    {
        HoaDonHeader hdh;
        ArrayList<CTHD> list = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader hdh)
        {
            this.hdh = hdh;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd)
        {
            this.list.add(cthd);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
    
}
