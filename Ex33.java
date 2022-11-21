public class Ex33 {
    
    public boolean esPalindromo(String lin) {
        lin = sinTilde(lin);
        lin = sinChar(lin);
        String nil = "";
        for (int i = 0; i <= lin.length() - 1; i++) {
            nil = lin.charAt(i) + nil;
        }

        if (nil.equals(lin)) {
            System.out.println(true);
            return true;
            
        } else {
            System.out.println(false);
            return false;
        }
    }

    public String sinTilde(String s) {
        s = s.replaceAll("" + 'á', "" + 'a');
        s = s.replaceAll("" + 'é', "" + 'e');
        s = s.replaceAll("" + 'í', "" + 'i');
        s = s.replaceAll("" + 'ó', "" + 'o');
        s = s.replaceAll("" + 'ú', "" + 'u');

        return s;

    }

    public String sinChar(String s) {
        String lin = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                lin += s.charAt(i);

            }
        }
        return lin.toLowerCase();
    }
}
