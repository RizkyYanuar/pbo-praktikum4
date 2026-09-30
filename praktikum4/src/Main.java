public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0, "blue");

        System.out.println("Circle 1 radius: " + circle1.getRadius());
        System.out.println("Circle 1 color: " + circle1.getColor());

        circle1.setColor("merah");
        circle1.setRadius(2.0);

        System.out.println("Circle 1 radius: " + circle1.getRadius());
        System.out.println("Circle 1 color: " + circle1.getColor());


        System.out.println(circle1);
    }
}
