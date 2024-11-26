public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(6, 10);
        Triangle triangle = new Triangle(20, 22, 25);

        // shapes collection
        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        // solve and print
        shapeCollection.getPropertyValues();
    }
}