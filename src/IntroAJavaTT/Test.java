package IntroAJavaTT;

public class Test {
    public static void main(String[] args) {
        PasswordSimple pass = new PasswordSimple();
        PasswordIntermedia pass2 = new PasswordIntermedia();
        PasswordFuerte pass3 = new PasswordFuerte();
        //pass.setValue("abcd");
        //pass.setValue("aaaddaadd1");
        //pass3.setValue("aaffafa2415P!");
        FiguraGeometrica[] arrayFiguras = new FiguraGeometrica[3];
        arrayFiguras[0]= new Circulo(10.0);
        arrayFiguras[1]= new Triangulo(10.0,5.0);
        arrayFiguras[2]= new Rectangulo(10.0,5.0);
        System.out.println("El promedio de las areas es:"+GeometricUtil.areaPromedio(arrayFiguras));
    }
}
