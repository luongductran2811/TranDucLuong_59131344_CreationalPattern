/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.shape.drawstyle;

import BaiTap3.shape.Shape;

/**
 *
 * @author doanm
 */
public class Rectangle extends Shape
{
    private static Rectangle instance;
    
    protected Rectangle()
    {
        
    }
    
    public static Rectangle createInstance()
    {
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }
    
    @Override
    public String draw() 
    {
        return "Vẽ hình chữ nhật";
    }   
}
