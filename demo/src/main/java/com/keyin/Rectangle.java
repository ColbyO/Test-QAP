package com.keyin;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    Rectangle(Rectangle r){
        this.length = r.length;
        this.width = r.width;
    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return(this.length*this.width);
    }

    public double getPerimeter(){
        return (2*(this.length+this.width));
    }

    public String toString(){
        return("Rectangle[length="+getLength()+",width="+getWidth()+"]");
    }

    public boolean checkTest(){
        return true;
    }
}