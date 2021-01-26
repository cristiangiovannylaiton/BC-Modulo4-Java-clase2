package IntroAJavaTM;

public class StringUtilsCustom {
    public static String rpad(String s,char c,int n){
        String sc = String.valueOf(c);
        for (int i =0; i < n; i++){
            s=s+sc;
        }
        return s;
    }
    public static String lpad(String s,char c,int n){
        String sc = String.valueOf(c);
        for (int i =0; i < n; i++){
            s=sc+s;
        }
        return s;
    }
    public static String ltrim(String s){
        int initPos = 0;
        boolean emptyCheck= false;
        for(int i =0 ; i < s.length(); i++){
            if (s.substring(i,i+1).equals(" ")){
                   initPos=i+1;
            }else{
                emptyCheck = true;
                break;
            }
        }
        if (!emptyCheck){
            return "";
        }else{
            return s.substring(initPos);
        }
    }
    public static String rtrim(String s){
        int initPos = 0;
        boolean emptyCheck= false;
        for(int i =s.length()-1 ; i >=0; i--){
            if (s.substring(i,i+1).equals(" ")){
                initPos=i;
            }else{
                emptyCheck = true;
                break;
            }
        }
        if (!emptyCheck){
            return "";
        }else{
            return s.substring(0,initPos);
        }
    }
    public static String trim(String s){
        return ltrim(rtrim(s));
    }
    public static int indexOfN(String s,char c, int n){
        int count =0;
        String sc = String.valueOf(c);
        for(int i= 0; i < s.length();i++){
            if(s.substring(i,i+1).equals(sc)){
                count++;
            }if(count == n){
                return i;
            }
        }
        return -1;
    }
}
