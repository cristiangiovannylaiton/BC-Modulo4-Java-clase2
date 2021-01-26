package IntroAJavaTM;

public class Fraccion {
    private Long numerador;
    private Long denominador;

    public Fraccion(Long numerador, Long denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Long getNumerador() {
        return numerador;
    }

    public void setNumerador(Long numerador) {
        this.numerador = numerador;
    }

    public Long getDenominador() {
        return denominador;
    }

    public void setDenominador(Long denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Long numerador, Long denominador) {
        Long nuevoNumerador = this.numerador + numerador;
        Long nuevoDenominador = this.denominador * denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);

    }

    public Fraccion restar(Long numerador, Long denominador) {
        Long nuevoNumerador = this.numerador - numerador;
        Long nuevoDenominador = this.denominador * denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Long numerador, Long denominador) {
        Long nuevoNumerador = this.numerador * numerador;
        Long nuevoDenominador = this.denominador * denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(Long numerador, Long denominador) {
        Long nuevoNumerador = this.numerador * denominador;
        Long nuevoDenominador = this.denominador * numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion sumar(Long numero) {
        Long nuevoNumerador = this.numerador + numerador;
        Long nuevoDenominador = this.denominador * denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);

    }

    public Fraccion restar(Long numero) {
        Long nuevoNumerador = this.numerador - numero;
        Long nuevoDenominador = this.denominador * 1;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Long numero) {
        Long nuevoNumerador = this.numerador * numero;
        Long nuevoDenominador = this.denominador * 1;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(Long numero) {
        Long nuevoNumerador = this.numerador * numero;
        Long nuevoDenominador = this.denominador * 1;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }


}
