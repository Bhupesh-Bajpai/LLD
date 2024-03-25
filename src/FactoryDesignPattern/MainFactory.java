package FactoryDesignPattern;

public class MainFactory {
    public static void main(String[] args) {

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape = shapeFactoryObj.getShape("Circle");
        shape.draw();
    }
}
