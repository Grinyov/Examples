package anonim;

/**
 * Created by green on 22.07.2015.
 *
 * анонимный класс в перечислении
 *
 * ƒл€ перечислени€ объ€вление анонимного внутреннего класса выгл€дит
 несколько иначе, так как инициализаци€ всех элементов происходит при
 первом обращении к типу. ѕоэтому и анонимный класс реализуетс€ только
 внутри объ€влени€ типа enum, как это сделано в следующем примере.
 */
public enum Shape {

    RECTANGLE, SQUARE, TRIANGLE { // анонимный класс
        public double computeSquare() { // верси€ дл€ TRIANGLE
            return this.getA() * this.getB() / 2;
        }
    };
    private double a;
    private double b;
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void setShape(double a, double b) {
        if ((a <= 0 || b <= 0) || a != b && this == SQUARE) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
    }
    public double computeSquare() { // верси€ дл€ RECTANGLE и SQUARE
        return a * b;
    }
    public String toString() {
        return name() + "-> a=" + a + ", b=" + b;
    }
}
