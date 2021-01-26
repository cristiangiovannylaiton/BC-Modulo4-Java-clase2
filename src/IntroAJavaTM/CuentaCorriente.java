package IntroAJavaTM;

public class CuentaCorriente {

    public Double saldo;

    public CuentaCorriente(Double valor) {
        this.saldo = valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double ingreso(Double valor){
        this.saldo += valor;
        return this.saldo;
    }
    public Double egreso(Double valor){
        this.saldo -= valor;
        return this.saldo;
    }
    public Double reintegro(Double valor){
        return ingreso(valor);
    }
    public Double trasnferencia(Double valor, CuentaCorriente cuentaACreditar){
        this.egreso(valor);
        cuentaACreditar.ingreso(valor);
        return this.saldo;
    }

}
