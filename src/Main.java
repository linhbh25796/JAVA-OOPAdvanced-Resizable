public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println(circle.toString());
        circle.resize(1.5);
        System.out.println(circle.toString());

        Rectangle r = new Rectangle();
        r.setWidth(3);
        r.setLength(4);
        System.out.println(r.toString());
        r.resize(1.5);
        System.out.println(r.toString());

        Square s = new Square();
        s.setA(5);
        System.out.println(s.toString());
        s.resize(1.5);
        System.out.println(s.toString());
    }
}
