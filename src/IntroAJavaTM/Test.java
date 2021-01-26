package IntroAJavaTM;

public class Test {
    public static void main(String[] args) {

        Fraccion frac1 = new Fraccion(Long.valueOf(2),Long.valueOf(5));
        Fraccion frac2 = new Fraccion(Long.valueOf(2),Long.valueOf(5));
        Fraccion frac3 = frac1.dividir(frac2.getNumerador(), frac2.getDenominador());
        System.out.println(frac3.getNumerador() + "/" + frac3.getDenominador());
        System.out.println(StringUtilsCustom.rpad("12345",'x',2));
        System.out.println(StringUtilsCustom.lpad("12345",'x',2));
        System.out.println(StringUtilsCustom.ltrim("    1"));
        System.out.println(StringUtilsCustom.rtrim("166667   "));
        System.out.println(StringUtilsCustom.trim("  txxxxxt  "));
        System.out.println(StringUtilsCustom.indexOfN("00011000001",'1',2));



    }
}
