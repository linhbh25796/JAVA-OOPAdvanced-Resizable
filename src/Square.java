public class Square extends Shape implements Resizeable{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void resize(double percent) {
        this.a += this.a*percent;
    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getA()
                + ", which is a subclass of "
                + super.toString();
    }
}