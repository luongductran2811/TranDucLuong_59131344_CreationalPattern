/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.shape;

/**
 *
 * @author doanm
 */
public abstract class Shape 
{
    protected String brush; 
    protected String paper;
    protected String frame;

    public Shape() {
    }

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
    
    public abstract String draw();

    @Override
    public String toString() {
        return draw() + "\n" 
                + "Loại dụng cụ: " + brush + "\n"
                + "Loại giấy: " + paper + "\n"
                + "Loại khung: " + frame +"\n"
                + "----------------------------------------";
    }  
}
