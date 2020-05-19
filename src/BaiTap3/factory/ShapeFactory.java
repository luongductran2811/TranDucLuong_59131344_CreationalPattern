/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.factory;

import BaiTap3.shape.Shape;
import BaiTap3.shape.ShapeType;
import BaiTap3.shape.drawstyle.Circle;
import BaiTap3.shape.drawstyle.Rectangle;
import BaiTap3.shape.drawstyle.Triangle;

/**
 *
 * @author doanm
 */
public class ShapeFactory 
{
    public Shape createShape(ShapeType type)
    {
        Shape shape;
        switch(type)
        {
            case circle: return shape = Circle.createInstance();
            case triangle: return shape = Triangle.createInstance();
            case rectangle: return shape = Rectangle.createInstance();
        }
        return null;
    } 
}
