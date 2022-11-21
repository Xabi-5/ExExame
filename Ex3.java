import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine().trim();
        System.out.println(esPalindromo(linea));
        
    }

    public static boolean esPalindromo(String lin){
        lin = sinTilde(lin);
        lin = sinChar(lin);
        String nil = "";
        for(int i = 0; i <= lin.length();i++){
            nil+= lin.charAt(i) + nil;
        }
        if(nil == lin){
            return true;
        }else{
            return false;
        }
    }
    public static String sinTilde(String s){
        s = s.replaceAll("" + 'á', "" + 'a');
        s = s.replaceAll("" + 'é', "" + 'e');
        s = s.replaceAll("" + 'í', "" + 'i');
        s = s.replaceAll("" + 'ó', "" + 'o');
        s = s.replaceAll("" + 'ú', "" + 'u');
        return s;

    }
    public static String sinChar(String s){
        String lin = "";
        for(int i =0; i <= s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                lin += s.charAt(i);
            }
        }
        return lin.toLowerCase();
    }
}

