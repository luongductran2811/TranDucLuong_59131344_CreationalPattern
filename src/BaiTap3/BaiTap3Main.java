/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import BaiTap3.factory.ShapeFactory;
import BaiTap3.shape.Shape;
import BaiTap3.shape.ShapeType;
import BaiTap3.shape.drawstyle.Circle;

/**
 *
 * @author doanm
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ShapeFactory sf = new ShapeFactory();
        Shape c1 = sf.createShape(ShapeType.circle);
        c1.setBrush("Bút chì");
        c1.setPaper("A4 trắng, mỏng");
        c1.setFrame("Khung tròn thẳng");
        System.out.println(c1.toString()); //Hiển thị hình tròn 1
        
        Shape c2 = sf.createShape(ShapeType.circle);
        c2.setBrush("Bút mực");
        c2.setPaper("A4 đen, dày");
        c2.setFrame("khung tròn méo");
        System.out.println(c2.toString()); //Hiển thị hình tròn 2
        
        System.out.println(c1.toString()); //Hiển thị lại kết quả của hình tròn 2
        
//        Shape r1 = sf.createShape(ShapeType.rectangle);
//        r1.setBrush("Bút lông");
//        r1.setPaper("A4 xám, dày");
//        r1.setFrame("khung chữ nhật");
//        System.out.println(r1.toString());
//        
//        Shape r2 = sf.createShape(ShapeType.rectangle);
//        r2.setBrush("Bút lá cọ");
//        r2.setPaper("Lá cây");
//        r2.setFrame("Khung gỗ");
//        System.out.println(r2.toString());
//        
//        System.out.println(r1.toString());

    }
    
}
