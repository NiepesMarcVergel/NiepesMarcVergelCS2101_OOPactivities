public class Car {
    private String color;
    private double price;
    private char size;

    // Car constructor
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   // Accept s, m, l in uppercade
    public void setSize(char size) {
        char upperSize = Character.toUpperCase(size);
        if (upperSize == 'S' || upperSize == 'M' || upperSize == 'L') {
            this.size = upperSize;
        } else {
            throw new IllegalArgumentException("Size must be 'S', 'M', or 'L'.");
        }
    }
    
    public String toString() {
        // Identify size
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "size is not determined";
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }

    // Main for car testing in given format
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'm');
        Car car2 = new Car("blue", 50000.00, 'L');

        System.out.println(car1);
        System.out.println(car2);
    }
}
