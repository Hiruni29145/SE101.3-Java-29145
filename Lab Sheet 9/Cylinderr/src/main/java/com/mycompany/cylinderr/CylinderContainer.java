
package com.mycompany.cylinderr;


public class CylinderContainer extends Cylinderr
{
    
    private double height,radius;
    
    public CylinderContainer(double height, double radius)
    {
        this.height=height;
        this.radius=radius;
    }
    
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}
