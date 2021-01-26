package IntroAJavaTM;

public class Contador {
    private Integer valor;

    public Contador() {
        this.valor = 0;
    }
    public Contador(Integer valor) {
        this.valor = valor;
    }
    public Contador(Contador contador) {
        this.valor = contador.getValor();
    }

    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public void incremento (){
        this.valor++;
    }
    public void decremento (){
        this.valor--;
    }

}
