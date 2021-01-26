package IntroAJavaTT;

public class Circulo extends FiguraGeometrica{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio,2);
    }
}
