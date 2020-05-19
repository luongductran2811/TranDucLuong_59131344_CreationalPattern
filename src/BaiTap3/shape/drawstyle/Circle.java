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
public class Circle extends Shape
{
    private static Circle instance;
    
    protected Circle()
    {
        
    }
    
    public static Circle createInstance()
    {
        if(instance == null)
            instance = new Circle();
        return instance;
    }
    
    @Override
    public String draw() 
    {
        return "Vẽ hình tròn";
    }   
}
