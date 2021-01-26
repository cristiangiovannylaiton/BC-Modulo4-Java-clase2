package IntroAJavaTT;

public class GeometricUtil {
    public static double areaPromedio(FiguraGeometrica arr[] ){
        double areaSum =0;
        for(FiguraGeometrica f:arr){
            areaSum+= f.area();
        }
        return areaSum/arr.length;
    }
}
