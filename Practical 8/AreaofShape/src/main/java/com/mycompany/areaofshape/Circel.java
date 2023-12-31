
package com.mycompany.areaofshape;

public class Circel implements Shape
{
    public double radius;
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    @Override
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}
