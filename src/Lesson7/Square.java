package Lesson7;

public class Square extends Shapes {
    public double width;
    public double height;
    public double side;


    public Square(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Square(double side)
    {
        this.side = side;
    }

    public double calculateArea()
    {
        return width * height;
    }

    public double calculatePerimeter()
    {
        return 2 * (width + height);
    }
}


