package IntroAJavaTM;

public class Fecha  {
    private Integer año;
    private Integer mes;
    private Integer dia;
    private Integer hora;
    private Integer minuto;
    private Integer segundo;

    public Fecha(Integer año, Integer mes, Integer dia, Integer hora, Integer minuto, Integer segundo) {
        verificarFecha(año, mes, dia, hora, minuto, segundo);
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Fecha(Integer año, Integer mes, Integer dia) {
        verificarFecha(año, mes, dia,0,0,0);
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;

    }
    public void verificarFecha(Integer año, Integer mes, Integer dia, Integer hora, Integer minuto, Integer segundo){
        if(año < 0 ){
            throw new RuntimeException("Año invalido");
        }
        if(mes < 1 || mes > 12 ){
            throw new RuntimeException("Año invalido");
        }
        if(dia < 1 || dia > 31){
            throw new RuntimeException("Año invalido");
        }
        if(hora < 0 || hora > 23 ){
            throw new RuntimeException("Año invalido");
        }
        if(minuto < 0 || minuto >59 ){
            throw new RuntimeException("Año invalido");
        }
        if(segundo < 0 || segundo > 59){
            throw new RuntimeException("Año invalido");
        }

    }

}
