package eu.ase.acs.solid.l;

public class Rectangle {
    int height;
    int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea()
    {
        return this.height*this.width;
    }
}
